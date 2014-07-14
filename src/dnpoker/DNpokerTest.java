package dnpoker;
import static org.junit.Assert.*;

import org.junit.Test;

public class DNpokerTest {
	DNpoker dNpoker = new DNpoker();

	@Test
	public void testDNpoker() {
		DNpoker test = new DNpoker();
		// fail("Not yet implemented");
	}

	@Test
	public void testDisplay() {
		dNpoker.pokers[0] = new Poker(2, 1);
		dNpoker.pokers[1] = new Poker(2, 6);
		dNpoker.pokers[2] = new Poker(1, 2);
		dNpoker.pokers[3] = new Poker(0, 6);
		dNpoker.pokers[4] = new Poker(2, 1);
		dNpoker.display();
		// fail("Not yet implemented");
	}

	@Test
	public void testFindcow() {
		DNpoker dNpoker0 = new DNpoker();
		DNpoker dNpoker1 = new DNpoker();
		DNpoker dNpoker2 = new DNpoker();
		DNpoker dNpoker3 = new DNpoker();
		DNpoker dNpoker4 = new DNpoker();
		DNpoker dNpoker5 = new DNpoker();
		DNpoker dNpoker6 = new DNpoker();
		DNpoker dNpoker7 = new DNpoker();
		DNpoker dNpoker8 = new DNpoker();
		DNpoker dNpoker9 = new DNpoker();
		DNpoker dNpoker10 = new DNpoker();
		DNpoker dNpoker11 = new DNpoker();
		DNpoker dNpoker12 = new DNpoker();
		DNpoker dNpoker13 = new DNpoker();
		Poker[] pokers0 = { new Poker(0, 1), new Poker(1, 3), new Poker(2, 7),
				new Poker(3, 5), new Poker(0, 0) };
		Poker[] pokers1 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 5), new Poker(1, 4) };
		Poker[] pokers2 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 5), new Poker(1, 5) };
		Poker[] pokers3 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 5), new Poker(1, 6) };
		Poker[] pokers4 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 4), new Poker(1, 8) };
		Poker[] pokers5 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 8), new Poker(1, 5) };
		Poker[] pokers6 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 7), new Poker(1, 7) };
		Poker[] pokers7 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 7), new Poker(1, 8) };
		Poker[] pokers8 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 9), new Poker(1, 7) };
		Poker[] pokers9 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 9), new Poker(1, 8) };
		Poker[] pokers10 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 2), new Poker(1, 6) };
		Poker[] pokers11 = { new Poker(0, 2), new Poker(1, 2), new Poker(2, 2),
				new Poker(3, 2), new Poker(1, 3) };
		Poker[] pokers12 = { new Poker(0, 11), new Poker(1, 10),
				new Poker(2, 11), new Poker(3, 12), new Poker(0, 10) };
		Poker[] pokers13 = { new Poker(0, 0), new Poker(1, 0), new Poker(2, 1),
				new Poker(3, 1), new Poker(1, 2) };
		dNpoker0.pokers = pokers0;
		dNpoker1.pokers = pokers1;
		dNpoker2.pokers = pokers2;
		dNpoker3.pokers = pokers3;
		dNpoker4.pokers = pokers4;
		dNpoker5.pokers = pokers5;
		dNpoker6.pokers = pokers6;
		dNpoker7.pokers = pokers7;
		dNpoker8.pokers = pokers8;
		dNpoker9.pokers = pokers9;
		dNpoker10.pokers = pokers10;
		dNpoker11.pokers = pokers11;
		dNpoker12.pokers = pokers12;
		dNpoker13.pokers = pokers13;

		assertEquals(0, dNpoker0.findcow());
		assertEquals(1, dNpoker1.findcow());
		assertEquals(2, dNpoker2.findcow());
		assertEquals(3, dNpoker3.findcow());
		assertEquals(4, dNpoker4.findcow());
		assertEquals(5, dNpoker5.findcow());
		assertEquals(6, dNpoker6.findcow());
		assertEquals(7, dNpoker7.findcow());
		assertEquals(8, dNpoker8.findcow());
		assertEquals(9, dNpoker9.findcow());
		assertEquals(10, dNpoker10.findcow());
		assertEquals(11, dNpoker11.findcow());
		assertEquals(12, dNpoker12.findcow());
		assertEquals(13, dNpoker13.findcow());

		// fail("Not yet implemented");
	}

	@Test
	public void testCompare() {
		Poker[] pokers1 = { new Poker(2, 3), new Poker(2, 4), new Poker(2, 3),
				new Poker(2, 4), new Poker(3, 1) };
		Poker[] pokers2 = { new Poker(1, 3), new Poker(1, 6), new Poker(0, 5),
				new Poker(2, 3), new Poker(1, 2) };
		Poker[] pokers3 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 5), new Poker(1, 4) };
		Poker[] pokers4 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(3, 6), new Poker(1, 3) };
		Poker[] pokers5 = { new Poker(0, 2), new Poker(1, 4), new Poker(2, 1),
				new Poker(2, 6), new Poker(1, 3) };
		DNpoker dNpoker1 = new DNpoker();
		DNpoker dNpoker2 = new DNpoker();
		DNpoker dNpoker3 = new DNpoker();
		DNpoker dNpoker4 = new DNpoker();
		DNpoker dNpoker5 = new DNpoker();
		dNpoker1.pokers = pokers1;
		dNpoker2.pokers = pokers2;
		dNpoker3.pokers = pokers3;
		dNpoker4.pokers = pokers4;
		dNpoker5.pokers = pokers5;
		System.out.println(dNpoker1.findcow());
		System.out.println(dNpoker2.findcow());
		int win1 = DNpoker.compare(dNpoker1, dNpoker2);
		int win2 = DNpoker.compare(dNpoker2, dNpoker1);
		int win3 = DNpoker.compare(dNpoker3, dNpoker4);
		int win4 = DNpoker.compare(dNpoker4, dNpoker3);
		int win5 = DNpoker.compare(dNpoker4, dNpoker5);
		int win6 = DNpoker.compare(dNpoker5, dNpoker4);
		assertEquals(0, win1);
		assertEquals(1, win2);
		assertEquals(1, win3);
		assertEquals(0, win4);
		assertEquals(0, win5);
		assertEquals(1, win6);
		/// fail("Not yet implemented");
	}

	@Test
	public void testFindmaxcard() {
		DNpoker dNpoker = new DNpoker();
		dNpoker.pokers[0] = new Poker(0, 1);
		dNpoker.pokers[1] = new Poker(0, 2);
		dNpoker.pokers[2] = new Poker(2, 5);
		dNpoker.pokers[3] = new Poker(3, 4);
		dNpoker.pokers[4] = new Poker(1, 1);

		DNpoker dNpoker2 = new DNpoker();
		dNpoker2.pokers[0] = new Poker(0, 1);
		dNpoker2.pokers[1] = new Poker(0, 2);
		dNpoker2.pokers[2] = new Poker(2, 5);
		dNpoker2.pokers[3] = new Poker(3, 5);
		dNpoker2.pokers[4] = new Poker(1, 1);
		// System.out.println(poker.findmaxPoker(Pokers).result()+"asdasd");
		assertEquals(dNpoker.pokers[2], dNpoker.findmaxcard());
		assertEquals(dNpoker2.pokers[3], dNpoker2.findmaxcard());
		// fail("Not yet implemented");
	}

}
