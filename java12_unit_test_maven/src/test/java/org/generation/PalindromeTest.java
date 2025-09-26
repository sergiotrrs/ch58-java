package org.generation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
	
	Palindrome palindrome;
    
    @BeforeEach
    void init() {
    	palindrome = new Palindrome();
    }
    
    @Test
	void palindromeTest() {
		assertEquals( true, palindrome.isPalindrome("Oso"));
		assertEquals( false, palindrome.isPalindrome("Ver"));
		assertEquals( false, palindrome.isPalindrome("Hola"));
		assertEquals( false, palindrome.isPalindrome("Ocho"));
		assertEquals( false, palindrome.isPalindrome("Veronica"));
		assertEquals( true, palindrome.isPalindrome("Anita lava la tina"));
	}
    

}
