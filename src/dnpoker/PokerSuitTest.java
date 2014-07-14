package dnpoker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PokerSuitTest {

	@Test
	public void testPokerSuit() {
		PokerSuit pokerSuit = new PokerSuit();
		// fail("Not yet implemented");
	}

	@Test
	public void testGetDNpoker() {
		PokerSuit pokerSuit = new PokerSuit();
		DNpoker testDNpoker = pokerSuit.getDNpoker();
		assertEquals(5, testDNpoker.pokers.length);
		// fail("Not yet implemented");
	}

	@Test
	public void testShuffle() {
		PokerSuit pokerSuit = new PokerSuit();
		pokerSuit.shuffle();

		// fail("Not yet implemented");
	}

	@Test
	public void testWuxiaoniu() {
		PokerSuit pokerSuit1 = new PokerSuit();
		for (int i = 0; i < 52; i++) {
			pokerSuit1.getonecard();
		}
		DNpoker testDNpoker1 = pokerSuit1.wuxiaoniu();
		PokerSuit pokerSuit2 = new PokerSuit();
		for (int i = 0; i < 46; i++) {
			pokerSuit2.getonecard();
		}
		DNpoker testDNpoker2 = pokerSuit2.wuxiaoniu();
		PokerSuit pokerSuit3 = new PokerSuit();
		DNpoker testDNpoker3 = pokerSuit3.wuxiaoniu();

		assertEquals(13, testDNpoker1.findcow());
		// assertEquals(13, testDNpoker2.findcow());
		assertEquals(13, testDNpoker3.findcow());
		// fail("Not yet implemented");
	}

	@Test
	public void testWuhuaniu() {
		PokerSuit pokerSuit = new PokerSuit();
		PokerSuit pokerSuit2 = new PokerSuit();
		for (int i = 0; i < 52; i++) {
			pokerSuit.getonecard();
		}
		for (int i = 0; i < 46; i++) {
			pokerSuit2.getonecard();
		}
		DNpoker testDNpoker = pokerSuit.wuhuaniu();
		// System.out.println(pokerSuit.getamount());

		DNpoker testDNpoker1 = pokerSuit.wuhuaniu();
		DNpoker testDNpoker2 = pokerSuit2.wuhuaniu();
		testDNpoker.display();
		testDNpoker1.display();
		System.out.println(pokerSuit.getamount());

		assertEquals(12, testDNpoker.findcow());
		// fail("Not yet implemented");
	}

	@Test
	public void testSizha() {
		PokerSuit pokerSuit1 = new PokerSuit();
		for (int i = 0; i < 52; i++) {
			pokerSuit1.getonecard();
		}
		DNpoker testDNpoker1 = pokerSuit1.sizha();
		PokerSuit pokerSuit2 = new PokerSuit();
		for (int i = 0; i < 46; i++) {
			pokerSuit2.getonecard();
		}
		DNpoker testDNpoker2 = pokerSuit2.sizha();
		PokerSuit pokerSuit3 = new PokerSuit();
		DNpoker testDNpoker3 = pokerSuit3.sizha();
		assertEquals(11, testDNpoker1.findcow());
		// assertEquals(11, testDNpoker2.findcow());
		assertEquals(11, testDNpoker3.findcow());
		// fail("Not yet implemented");
	}

	@Test(timeout = 2000)
	public void testNiu() {
		PokerSuit pokerSuit1 = new PokerSuit();
		for (int i = 0; i < 52; i++) {
			pokerSuit1.getonecard();
		}
		DNpoker testDNpoker1 = pokerSuit1.niu(1);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker2 = pokerSuit1.niu(2);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker3 = pokerSuit1.niu(3);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker4 = pokerSuit1.niu(4);
		PokerSuit pokerSuit2 = new PokerSuit();
		for (int i = 0; i < 46; i++) {
			pokerSuit2.getonecard();
		}
		DNpoker testDNpoker5 = pokerSuit2.niu(5);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker6 = pokerSuit2.niu(6);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker7 = pokerSuit2.niu(7);
		// PokerSuit pokerSuit1=new PokerSuit();
		DNpoker testDNpoker8 = pokerSuit1.niu(8);
		PokerSuit pokerSuit3 = new PokerSuit();
		DNpoker testDNpoker9 = pokerSuit3.niu(9);
		DNpoker testDNpoker0 = pokerSuit3.niu(0);
		assertEquals(10, testDNpoker0.findcow());
		assertEquals(1, testDNpoker1.findcow());
		assertEquals(2, testDNpoker2.findcow());
		assertEquals(3, testDNpoker3.findcow());
		assertEquals(4, testDNpoker4.findcow());
		// assertEquals(5, testDNpoker5.findcow());
		// assertEquals(6, testDNpoker6.findcow());
		// assertEquals(7, testDNpoker7.findcow());
		assertEquals(8, testDNpoker8.findcow());
		assertEquals(9, testDNpoker9.findcow());

	}

	@Test
	public void testWuniu() {
		PokerSuit pokerSuit1 = new PokerSuit();
		PokerSuit pokerSuit2 = new PokerSuit();
		for (int i = 0; i < 52; i++) {
			pokerSuit2.getonecard();
		}
		for (int i = 0; i < 46; i++) {
			pokerSuit1.getonecard();
		}
		DNpoker testDNpoker1 = pokerSuit1.wuniu();
		DNpoker testDNpoker2 = pokerSuit2.wuniu();
		DNpoker testDNpoker3 = pokerSuit1.wuniu();
		DNpoker testDNpoker4 = pokerSuit2.wuniu();
		// assertEquals(0, testDNpoker1.findcow());
		assertEquals(0, testDNpoker2.findcow());
		assertEquals(0, testDNpoker4.findcow());
		// fail("Not yet implemented");
	}

	@Test
	public void testIsequal() {
		assertEquals(true, PokerSuit.isequal(1, 1, 1, 1));
		assertEquals(false, PokerSuit.isequal(2, 1, 1, 1));
		// fail("Not yet implemented");
	}

	@Test
	public void testGetamount() {
		PokerSuit pokerSuit1 = new PokerSuit();
		assertEquals(52, pokerSuit1.getamount());
		PokerSuit pokerSuit2 = new PokerSuit();
		assertEquals(52, pokerSuit2.getamount());
		// fail("Not yet implemented");
	}

	@Test
	public void testGetonecard() {
		PokerSuit pokerSuit = new PokerSuit();
		pokerSuit.getonecard();
		assertEquals(52, pokerSuit.getamount());
		pokerSuit.getonecard();
		assertEquals(52, pokerSuit.getamount());
		for (int i = 0; i < 52; i++) {
			pokerSuit.getonecard();
		}
		// fail("Not yet implemented");
	}

	@Test
	public void testGetpokers() {
		ArrayList<Poker> pokers;
		PokerSuit pokerSuit = new PokerSuit();
		pokers = (ArrayList<Poker>) pokerSuit.getpokers();
		for (int i = 0; i < pokers.size(); i++) {
			System.out.println(pokers.get(i).result() + "~~" + pokers.size());
		}
		// fail("Not yet implemented");
	}

	@Test
	public void testGetunique() {
		PokerSuit pokerSuit = new PokerSuit();
		for (int i = 0; i < 20; i++) {
			Poker testPoker = pokerSuit.pokers.get(i);
			assertEquals(testPoker, pokerSuit.getunique(i));
		}
		// fail("Not yet implemented");
	}

	@Test
	public void testRemoveunique() {
		PokerSuit pokerSuit = new PokerSuit();
		Poker testPoker1 = pokerSuit.pokers.get(0);
		Poker testPoker2 = pokerSuit.pokers.get(1);

		assertEquals(testPoker1, pokerSuit.removeunique(0));
		assertEquals(testPoker2, pokerSuit.pokers.get(0));
		// fail("Not yet implemented");
	}

}
