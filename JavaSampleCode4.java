import java.util.*;

class Main {

    static List<LinkedList<Integer>> piles;

    static void initialize(int n) {
        piles = new LinkedList<>();

        // 3本の杭を作る
        for (int i=0; i<3; i++)
            piles.add(new LinkedList<>());

        // 0番の杭に、n枚の円盤を追加
        for (int i=n; i>=1; i--)
            piles.get(0).add(i);
    }

	static void printPiles() {
		System.out.println("--");

		for (int i=0; i<3; i++) {
			System.out.print(i + ":");
			for (int disk : piles.get(i))
				System.out.print(" " + disk);

			System.out.println();
		}
	}

	static void moveOne(int from, int to) {
		int disk = piles.get(from).removeLast();
	    piles.get(to).add(disk);
	}

	static void hanoi(int n, int from, int to, int work) {
        if (n == 0) {
            return;
        }

        hanoi(n-1, from, work, to);
        moveOne(from, to);
        printPiles();
        hanoi(n-1, work, to, from);
    }

	public static void main(String args[] ) {
		int n = 4;
		System.out.println(n);

		initialize(n);
		printPiles();
	    hanoi(n, 0, 1, 2);
	}
}
