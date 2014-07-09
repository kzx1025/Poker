import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class XipaiTest {
	public static Xipai xipai=new Xipai();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testXipai() {
		Xipai xipai;
		//fail("Not yet implemented");
	}

	@Test
	public void testGetamount() {
		xipai.getamount();
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveonecard() {
		xipai.removeonecard();
		//fail("Not yet implemented");
	}

	@Test
	public void testGetcards() {
	ArrayList<Card> cards;
		cards=(ArrayList<Card>) xipai.getcards();
		 for(int i=0;i<cards.size();i++){   
		     System.out.println(cards.get(i).result()+"~~"+cards.size());  
		  }   
		//fail("Not yet implemented");
	}

	@Test
	public void testGetunique() {
		for(int i=0;i<51;i++)
		xipai.getunique(i);
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveunique() {
		for(int i=0;i<51;i++)
		xipai.removeunique(0);
		//fail("Not yet implemented");
	}

}
