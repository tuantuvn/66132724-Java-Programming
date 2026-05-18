import java.util.Scanner;
import java.util.ArrayList;
public class mangsonguyen {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> li = new ArrayList<Integer>();			for (int i = 0; i < 10; i++)
			{
				System.out.print("a[" + i + "]=");
				Integer tmp = sc.nextInt();
				li.add(tmp);
			}
			for(Integer x: li)
			{
				System.out.print(x + " ");
			}
			int cntc = 0;
			for(Integer x: li)
			{
				cntc += ((x + 1) % 2);
			}
			System.out.println("Số phần tử chẵn là: " + cntc);
			int tongpt = 0;
			for (Integer x: li)
			{
				tongpt += x;
			}
			System.out.println("Tổng tất cả các phần tử là: " + tongpt);
			sc.close();
	}
}
