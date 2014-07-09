import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FapaiTest {
	Fapai fapai=new Fapai();
	Xipai xipai=new Xipai();
	Logger logger = LoggerFactory.getLogger(Test.class);
	@Test
	public void testWuhuaniu() {
		Card[]cards=new Card[5];
		cards=fapai.wuhuaniu(xipai);
		for(int i=0;i<5;i++)
		{
		   logger.info(cards[i].result());
		}
		//fail("Not yet implemented");
	}

	@Test
	public void testIsequal() {
		if(!fapai.isequal(1, 1, 1, 1))
			fail();
		//fail("Not yet implemented");
	}
	
	@Test
	public void testWuxiaoniu() {
		Card[]cards=new Card[5];
		cards=fapai.wuxiaoniu(xipai);
		for(int i=0;i<5;i++)
		{
		   logger.info(cards[i].result());
		}
		//fail("Not yet implemented");
	}
	@Test
	public void testSizha() {
		Card[]cards=new Card[5];
		cards=fapai.sizha(xipai);
		for(int i=0;i<5;i++)
		{
		   logger.info(cards[i].result());
		}
		//fail("Not yet implemented");
	}
	@Test
	public void testNiu() {
		//Card[]cards=new Card[5];
		for(int i=0;i<3;i++)
		    fapai.niu(xipai,i);
		
		
		//fail("Not yet implemented");
	}

}
