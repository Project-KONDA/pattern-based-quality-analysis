const https = require("https")
const MODE = process.argv[3] == "POST"? "POST" : "GET"

const paramCount = parseInt(process.argv[2] || "10")

const url = new URL("https://localhost/qpm/constraint/execute/xml")

// ----- create parameter object -----
const filename = "uploads/170b6254-c12b-4822-8bc2-9241a5ecb41b_mini.xml"
const constraintID = "LinkMimeType_xml_default_0"

const params = {
  constraintIDs: `${constraintID}`,
  files: Array.from({length: paramCount}, (_, i) => `${filename}`) // example repeated params
}

// ----- allow self-signed certificate (DEV ONLY) -----
const agent = new https.Agent({
  rejectUnauthorized: false
})

if (MODE === "GET") {
  // append query parameters
  Object.entries(params).forEach(([key, value]) => {
    if (Array.isArray(value)) {
      value.forEach(v => url.searchParams.append(key, v))
    } else {
      url.searchParams.append(key, value)
    }
  })

  const req = https.request({
    hostname: url.hostname,
    port: 443,
    path: url.pathname + url.search,
    method: "GET",
    agent
  }, handleResponse)

  req.on("error", console.error)
  req.end()
}

if (MODE === "POST") {
  const jsonData = JSON.stringify(params)

  const req = https.request({
    hostname: url.hostname,
    port: 443,
    path: url.pathname,
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      "Content-Length": Buffer.byteLength(jsonData)
    },
    agent
  }, handleResponse)

  req.on("error", console.error)

  req.on("end", () => {
    try {
        const parsed = JSON.parse(body)
        console.log("Parsed JSON:", parsed)
    } catch (e) {
        console.log("Raw response:", body)
    }
  })

  req.write(jsonData)
  req.end()
}

// ----- response handler -----
function handleResponse(res) {
  console.log("Status:", res.statusCode)

  let data = ""
  res.on("data", chunk => data += chunk)
  res.on("end", () => {
    console.log("Response length:", data.length)
    if (data.length > 500)
        console.log("Response preview:", data.substring(0, 250) + " ... "  + data.substring(data.length-250, data.length))
    else 
        console.log("Response:", data)
  })
}