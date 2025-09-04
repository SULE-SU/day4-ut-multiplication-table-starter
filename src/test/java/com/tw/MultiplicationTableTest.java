package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {
    @Test
    public void should_return_single_expression_when_start_1_end_1() {
        // Given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 1;
        int end = 1;
        String expected = "1*1=1";

        // When
        String result = multiplicationTable.create(start, end);

        // Then
        assertEquals(expected, result);
    }
    @Test
    public void should_return_correct_table_when_start_2_and_end_3() {
        // Given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 3;
        String expected = "2*2=4\n2*3=6\t3*3=9";

        // When
        String result = multiplicationTable.create(start, end);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void should_return_correct_table_when_start_2_and_end_4(){
        // Given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 4;
        String expected = "2*2=4\n2*3=6\t3*3=9\n2*4=8\t3*4=12\t4*4=16";

        // When
        String result = multiplicationTable.create(start, end);

        // Then
        assertEquals(expected, result);
    }
    @Test
    public void should_return_null_when_start_2_and_end_1() {
        // Given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 1;

        // When
        String result = multiplicationTable.create(start, end);

        // Then
        assertNull(result);
    }

    @Test
    public void should_return_null_when_start_1001_and_end_1001() {
        // Given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 1001;
        int end = 1001;

        // When
        String result = multiplicationTable.create(start, end);

        // Then
        assertNull(result);
    }


}
