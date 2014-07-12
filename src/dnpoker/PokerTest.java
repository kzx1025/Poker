package dnpoker;
import static org.junit.Assert.*;

import org.junit.Test;


public class PokerTest {
    
	@Test
	public void testPoker() {
		int i=2;
    	int j=6;
		Poker poker1=new Poker(i, j);
		//System.out.println(card1.color);
		assertEquals(2, poker1.color);
		assertEquals(6, poker1.value);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetcolor() {
		Poker poker1=new Poker(0, 13);
		Poker poker2=new Poker(1, 13);
		assertEquals(0, poker1.getcolor());
		assertEquals(1, poker2.getcolor());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetvalue() {
		Poker poker1=new Poker(0, 13);
		Poker poker2=new Poker(1, 9);
		assertEquals(13, poker1.getvalue());
		assertEquals(9, poker2.getvalue());
		//fail("Not yet implemented");
	}

	@Test
	public void testResult() {
		Poker poker1=new Poker(0, 11);
		Poker poker2=new Poker(1, 3);
		assertEquals("·½¿éQ", poker1.result());
		assertEquals("Ó£»¨4", poker2.result());
		//fail("Not yet implemented");
	}

	@Test
	public void testChangeJQK() {
		Poker testCard1=new Poker(1, 12);
		Poker testCard2=new Poker(1, 4);
		int value1=Poker.changeJQK(testCard1)+1;
		int value2=Poker.changeJQK(testCard2)+1;
	    assertEquals(10, value1);
	    assertEquals(5, value2);
		//fail("Not yet implemented");
	}

	@Test
	public void testComparesingle() {
		Poker t1=new Poker(0, 2);
		Poker t2=new Poker(1, 2);
		Poker t3=new Poker(0, 5);
		Poker t4=new Poker(1, 2);

		assertEquals(true, Poker.comparesingle(t2, t1));
		assertEquals(false, Poker.comparesingle(t1, t2));
		assertEquals(true, Poker.comparesingle(t3, t4));
		assertEquals(false, Poker.comparesingle(t4, t3));
		//fail("Not yet implemented");
	}

}
