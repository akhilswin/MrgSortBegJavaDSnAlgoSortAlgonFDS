package yaksha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;

import java.util.Arrays;

class MergeSortTest {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMergeSortMockito() throws Exception {
		int expectedResult[] = { 213, 219, 415, 615, 617, 819, 910, 1102 };
		int[] array = { 910, 213, 1101, 415, 615, 219, 617, 819 };
		Array array1 = new Array(array, 0, array.length - 1);
		MergeSort test = mock(MergeSort.class);
		Mockito.when(test.mergeSort(array1)).thenReturn(expectedResult);
		int result[] = test.mergeSort(array1);
		yakshaAssert(currentTest(), (Arrays.equals(result, expectedResult) ? true : false), businessTestFile);
	}
}
