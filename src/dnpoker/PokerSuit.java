package dnpoker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PokerSuit {
	protected ArrayList<Poker> pokers;
	protected int color_num = 4;
	protected int value_num = 13;
	protected int shuffle_num = 100;
	protected int poker_index;
	protected int maxSuitnum = 52;

	PokerSuit() {
		pokers = new ArrayList<Poker>();
		poker_index = 0;
		for (int a = 0; a < color_num; a++) {
			for (int b = 0; b < value_num; b++) {
				pokers.add(new Poker(a, b));// 在list里面添加所有可能的牌
				// System.out.println(pokers.size());
			}
		}

	}

	// 开始模拟洗牌
	public void shuffle() {
		int index1, index2;
		Random example = new Random();
		Poker temp;
		for (int i = 0; i < shuffle_num; i++) {
			index1 = example.nextInt(pokers.size() - 1);
			index2 = example.nextInt(pokers.size() - 1);
			temp = pokers.get(index1);
			pokers.set(index1, pokers.get(index2));
			pokers.set(index2, temp);
		}
	}

	public DNpoker getDNpoker() {
		DNpoker dnpoker = new DNpoker();
		for (int i = 0; i < dnpoker.dnpoker_num; i++) {
			dnpoker.pokers[i] = getonecard();
		}
		return dnpoker;
	}

	DNpoker wuxiaoniu() {
		DNpoker dnpoker = new DNpoker();
		int[] a = new int[5];
		for (int j = 0; j < 5; j++) {
			a[j] = poker_index;
		}
		int poker_num = maxSuitnum;
		Poker tempPoker = null;
		if (poker_index>maxSuitnum-dnpoker.dnpoker_num) { //防止当前牌索引超过总牌数减5
			poker_index=0;
			shuffle();
		}

		for (; a[0] < poker_num - 4; a[0]++) {

			if (getunique(a[0]).getvalue() + 1 >= 5)
				continue;
			for (a[1] = a[0] + 1; a[1] < poker_num - 3; a[1]++) {

				if (getunique(a[1]).getvalue() + 1 >= 5)
					continue;
				for (a[2] = a[1] + 1; a[2] < poker_num - 2; a[2]++) {

					if (getunique(a[2]).getvalue() + 1 >= 5)
						continue;
					for (a[3] = a[2] + 1; a[3] < poker_num - 1; a[3]++) {
						if (getunique(a[3]).getvalue() + 1 >= 5)
							continue;
						for (a[4] = a[3] + 1; a[4] < poker_num; a[4]++) {
							if (getunique(a[4]).getvalue() + 1 >= 5)
								continue;
							else if (getunique(a[0]).getvalue()
									+ getunique(a[1]).getvalue()
									+ getunique(a[2]).getvalue()
									+ getunique(a[3]).getvalue()
									+ getunique(a[4]).getvalue() + 5 <= 10) {
								dnpoker.pokers[0] = getunique(a[0]);
								dnpoker.pokers[1] = getunique(a[1]);
								dnpoker.pokers[2] = getunique(a[2]);
								dnpoker.pokers[3] = getunique(a[3]);
								dnpoker.pokers[4] = getunique(a[4]);
								for (int i = 0; i < 5; i++) {
									tempPoker = pokers.get(poker_index);
									pokers.set(poker_index, dnpoker.pokers[i]);

									pokers.set(a[i], tempPoker);
									poker_index++;
								}

								return dnpoker;
							}
						}

					}

				}

			}

		}

		return null;
	}

	// 五花牛
	DNpoker wuhuaniu() {
		DNpoker dnpoker = new DNpoker();
		int i = 0;
		int m = poker_index;
		int q=0;
		Poker temp;
		Poker tempPoker;
		int[] a = new int[5];
		
		for (int j = 0; j < 5; j++) {
			a[j] = poker_index;
		}
		if (poker_index>maxSuitnum-dnpoker.dnpoker_num) {  //防止当前牌索引超过总牌数减5
			poker_index=0;
			shuffle();
		}
		while (true) {
			
			temp = getunique(a[q]);
			if (temp.getvalue() + 1 > 10) {// 牌值大于10
				dnpoker.pokers[i] = temp;
				i++;
				a[q]=m;
				q++;
				m++;
				if (i > 4) {
					for (int j = 0; j < 5; j++) {
						tempPoker = pokers.get(poker_index);
						pokers.set(poker_index, dnpoker.pokers[j]);

						pokers.set(a[j], tempPoker);
						poker_index++;
					}
					return dnpoker;
					
				}
			} else {
				a[q]=m;
				m++;
			}
			if (m == maxSuitnum) {
				return null;
			}
		}
		
	}

	public DNpoker sizha() {
		DNpoker dnpoker = new DNpoker();
		int[] a = new int[5];
		a[0]=poker_index;
		Poker tempPoker;
		int pork_num = maxSuitnum;
		if (poker_index>maxSuitnum-dnpoker.dnpoker_num) { //防止当前牌索引超过总牌数减5
			poker_index=0;
			shuffle();
		}
	
		for (; a[0] < pork_num - 4; a[0]++) {
			for (a[1] = a[0] + 1; a[1] < pork_num - 3; a[1]++) {
				for (a[2] = a[1] + 1; a[2] < pork_num - 2; a[2]++) {
					for (a[3] = a[2] + 1; a[3] < pork_num - 1; a[3]++) {
						for (a[4] = poker_index; a[4] < pork_num; a[4]++)
							if ((isequal(getunique(a[0]).getvalue(),
									getunique(a[1]).getvalue(), getunique(a[2])
											.getvalue(), getunique(a[3])
											.getvalue()))
									&& (a[4] != a[0])
									&& (a[4] != a[1])
									&& (a[4] != a[2])
									&& (a[4] != a[3])
									&& (getunique(a[0]).getvalue() + 1 < 11)
									&& (getunique(a[0]).getvalue()
											+ getunique(a[1]).getvalue()
											+ getunique(a[2]).getvalue()
											+ getunique(a[3]).getvalue()
											+ getunique(a[4]).getvalue() + 5 > 10))// 待优化，需要调整防止是五花牛类型和五小类型的
							{
								dnpoker.pokers[0] = getunique(a[0]);
								dnpoker.pokers[1] = getunique(a[1]);
								dnpoker.pokers[2] = getunique(a[2]);
								dnpoker.pokers[3] = getunique(a[3]);
								dnpoker.pokers[4] = getunique(a[4]);
								
								for (int i = 0; i < 5; i++) {
									tempPoker = pokers.get(poker_index);
									pokers.set(poker_index, dnpoker.pokers[i]);

									pokers.set(a[i], tempPoker);
									poker_index++;
								}
								return dnpoker;
							}
					}
				}
			}
		}
		return null;
	}

	DNpoker niu(int niu_num) {
		// int i=1;
		int n = poker_index+2;
		int flag = 0;
		int[] a = new int[5];
		for (int j = 0; j < 5; j++) {
			a[j] = poker_index;
		}
		int hs = poker_index;
		Poker tempPoker;
		DNpoker dnpoker = new DNpoker();
		int poker_num = maxSuitnum;
		if (poker_index>maxSuitnum-dnpoker.dnpoker_num) { //防止当前牌索引超过总牌数减5
			poker_index=0;
			shuffle();
		}
		while (true) {
			a[0] = hs;
			for (; a[0] < poker_num - 2; a[0]++) {
				for (a[1] = a[0] + 1; a[0] < poker_num - 1; a[1]++) {
					for (a[2] = a[1] + 1; a[2] < poker_num; a[2]++) {
						if ((Poker.changeJQK(getunique(a[0]))
								+ Poker.changeJQK(getunique(a[1]))
								+ Poker.changeJQK(getunique(a[2])) + 3) % 10 == 0) {
							dnpoker.pokers[0] = getunique(a[0]);
							dnpoker.pokers[1] = getunique(a[1]);
							dnpoker.pokers[2] = getunique(a[2]);
							hs = a[0];
							flag = 1;
							break;
						}
					}
					if (flag == 1)
						break;
				}
				if (flag == 1)
					break;

			}
			if (hs >maxSuitnum-2) {
				break;

			}

			for ( a[3] = poker_index; a[3] < poker_num - 4; a[3]++) {
				for (a[4] = a[3] + 1; a[4] < poker_num - 3; a[4]++) {
					if ((a[3] != a[0]) &&(a[3] != a[1]) &&(a[3] != a[2]) &&(a[4] != a[0]) &&(a[4] != a[1]) && (a[4]!= a[2])) {
						// System.out.println(d.getunique(i).getvalue()+"!"+i+"and"+j+"!"+d.getamount());
						if ((Poker.changeJQK(getunique(a[3]))
								+ Poker.changeJQK(getunique(a[4])) + 2) % 10 == niu_num) {
							dnpoker.pokers[3] = getunique(a[3]);
							dnpoker.pokers[4] = getunique(a[4]);
						
							for (int i = 0; i < 5; i++) {
								tempPoker = pokers.get(poker_index);
								pokers.set(poker_index, dnpoker.pokers[i]);

								pokers.set(a[i], tempPoker);
								poker_index++;
							}
							return dnpoker;
						}
					}
				}

			}
			flag = 0;
		}// while 循环
		return null;
	}

	DNpoker wuniu() {
		DNpoker dnpoker = new DNpoker();
		int[] a = new int[5];
		for (int j = 0; j < 5; j++) {
			a[j] = poker_index;
		}
		int poker_num = maxSuitnum;
		Poker tempPoker = null;
		// System.out.println("数量:"+card_num);
		// temp=d.removeonecard();
		if (poker_index>maxSuitnum-dnpoker.dnpoker_num) { //防止当前牌索引超过总牌数减5
			poker_index=0;
			shuffle();
		}


		for (; a[0]< poker_num - 4; a[0]++) {
			for (a[1] = a[0] + 1; a[1] < poker_num - 3; a[1]++) {

				for (a[2] = a[1] + 1; a[2] < poker_num - 2; a[2]++) {

					for (a[3] = a[2] + 1; a[3] < poker_num - 1; a[3]++) {

						for (a[4] = a[3] + 1; a[4] < poker_num; a[4]++) {
							dnpoker.pokers[0] = getunique(a[0]);
							dnpoker.pokers[1] = getunique(a[1]);
							dnpoker.pokers[2] = getunique(a[2]);
							dnpoker.pokers[3] = getunique(a[3]);
							dnpoker.pokers[4] = getunique(a[4]);
							if (dnpoker.findcow() == 0) {
								for (int i = 0; i < 5; i++) {
									tempPoker = pokers.get(poker_index);
									pokers.set(poker_index, dnpoker.pokers[i]);

									pokers.set(a[i], tempPoker);
									poker_index++;
								}
								return dnpoker;
							}
						}
					}

				}

			}

		}

		// hs++;

		return null;
	}

	static boolean isequal(int a, int b, int c, int d) {
		if ((a == b) && (a == c) && (a == d)) {
			return true;
		} else {
			return false;
		}
	}

	public int getamount() {
		return pokers.size();
	}

	public Poker getonecard() {
		
		
		if (poker_index >= maxSuitnum) {
			poker_index=0;
			shuffle();
		}
		// 获取最上面一张牌
		return pokers.get(poker_index++);
	}

	public ArrayList<Poker> getpokers() {
		return pokers;
	}

	public Poker getunique(int m) {
		return pokers.get(m);
	}

	public Poker removeunique(int m) {
		return pokers.remove(m);
	}

}
