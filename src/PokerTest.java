import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
public class PokerTest {
	Xipai xipai=null;//初始化一个洗牌对象
	Poker poker=null;
	 private int expected;// 期待的结果值
/**
	    private Card[] input1;// 参数1

	    private Card[] input2;// 参数2
	@Parameters
    public static Collection prepareData()
    {
        // 测试数据
	

        Object[][][] objects={{{1},{new Card(1,6),new Card(0,10),new Card(2,7),new Card(0,6),new Card(2, 10)},{new Card(3,2),new Card(0,4),new Card(3,5),new Card(1,7),new Card(1, 3)}}
        		
        		
        	};
        
        return Arrays.asList(objects);// 将数组转换成集合返回

    }**/

	@Before
	public void setUp() throws Exception {
		xipai=new Xipai();
		poker=new Poker(xipai);
	}
	/**public PokerTest(Object expected[], Object[] input1, Object[] input2)
    {
        // 构造方法
        // JUnit会使用准备的测试数据传给构造函数
        this.expected = (Integer)expected[0];
        this.input1 = (Card[])input1;
        this.input2 = (Card[])input2;
    }**/
	@Test
	public void testPoker() {
		Xipai xipai=new Xipai();//初始化一个洗牌对象
		Poker poker=new Poker(xipai);
		//fail("Not yet implemented");
	}

	@Test
	public void testDisplay() {
		poker.display();
		//fail("Not yet implemented");
	}

	@Test
	public void testFindmaxcard() {
		Card cards[]=new Card[5];
		Card tempCard;
		for (int j=0;j<5;j++)
		{
			cards[j]=xipai.removeonecard();
		}
		tempCard=poker.findmaxcard(cards);
		//fail("Not yet implemented");
	}

	@Test
	public void testComparesingle() {
		Card t1=new Card(0, 2);
		Card t2=new Card(1, 2);
		
		if(!poker.comparesingle(t2, t1))
		{
			fail("bad");
		}
		
		//fail("Not yet implemented");
	}

	@Test
	public void testChangeJQK() {
		Card testCard=new Card(1, 12);
		int value=poker.changeJQK(testCard);
		if(value+1>10)
		{
			//System.out.println(value);
			fail();
		}
		//fail("Not yet implemented");
	}

	@Test
	public void testFindcow() {
		Card cards[]=new Card[5];
		for (int j=0;j<5;j++)
		{
			cards[j]=xipai.removeonecard();
		}
		poker.findcow(cards);
		//fail("Not yet implemented");
	}

	@Test
	public void testCompare() {
		Card[] card1=new Card[5];
		Card[] card2=new Card[5];
		card1[0]=new Card(2, 3);
		card1[1]=new Card(2, 4);
		card1[2]=new Card(2, 5);
		card1[3]=new Card(2, 4);
		card1[4]=new Card(3, 1);
		card2[0]=new Card(10, 3);
		card2[1]=new Card(1, 6);
		card2[2]=new Card(10, 5);
		card2[3]=new Card(10, 3);
		card2[4]=new Card(10, 2);
		poker.findcow(card2);
		poker.findcow(card1);
		int win = poker.compare(card1, card2);
		if(win!=1)
		{
			fail();
		}
		System.out.println(win);
		//fail("Not yet implemented");
		 //Assert.assertEquals(this.expected,
	               // poker.compare(this.input1, this.input2));
	}

}
