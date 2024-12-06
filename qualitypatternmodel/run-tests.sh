PROJECT_DIR=$(pwd)
MVN_CMD="mvn"

cd "$PROJECT_DIR" || { echo "Failed to navigate to $PROJECT_DIR"; exit 1; }

echo "Cleaning builds..."
$MVN_CMD clean
if [ $? -ne 0 ]; then
    echo "Failed to clean the project!"
    exit 1
fi

echo "Compiling the project..."
$MVN_CMD compile
if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

echo "Running JUnit tests..."
$MVN_CMD test
if [ $? -ne 0 ]; then
    echo "Some tests failed!"
    exit 1
else
    echo "All tests passed!"
fi