
public class Fapai {
	private Card[][] cards;
	public Fapai(Xipai d){
		// TODO Auto-generated constructor stub
		cards=new Card[4][5];
		for(int i=0;i<4;i++){
		for (int j=0;j<5;j++)
		{
			cards[i][j]=d.removeonecard();
		}
		}
	}
	
	void display()
	{
		for(int i=0;i<4;i++)
		{
		for(int j=-0;j<5;j++)
		{
			System.out.print(cards[i][j].result());
			System.out.print(",");
		}
		System.out.println();
		}
	}

}
