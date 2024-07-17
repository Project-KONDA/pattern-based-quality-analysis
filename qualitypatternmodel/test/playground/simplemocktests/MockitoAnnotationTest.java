package playground.simplemocktests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

//Tutorial:
//--> https://www.baeldung.com/mockito-series
public class MockitoAnnotationTest {
	@Test
	public void whenNotUseMockAnnotation_thenCorrect() {
	    @SuppressWarnings("unchecked")
		List<String> mockList = Mockito.mock(ArrayList.class);

	    mockList.add("one");
	    Mockito.verify(mockList).add("one");
	    assertEquals(0, mockList.size());

	    Mockito.when(mockList.size()).thenReturn(100);
	    assertEquals(100, mockList.size());
	}
}
