package com.maven2.assign;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maven2.assignment.StringHelper;

class StringHelperTest {
    StringHelper helper;
    @Before
    public void before()
    { helper = new StringHelper();
    	
    }
	//StringHelper helper = new StringHelper();

	@Test
public void testTruncateAInFirst2Positions_AInFirst2Pos() 
	{assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));}
	
	@Test
public void testTruncateAInFirst2Positions_AinFirstPos()
	{assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));}


@Test
public void testAreFirstAndLastTwoCharactersTheSame_Basic1()
{ 
	assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
}

@Test
public void testAreFirstAndLastTwoCharactersTheSame_Basic2()
{ 
	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
}
}