import java.util.ArrayList;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        //Cau 1
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("Danh sach ban dau: " + list);
        //Cau 2
        ArrayList<Integer> L1 = new ArrayList<Integer>();
        for (Integer num : list) {
            if (!L1.contains(num)) {
                L1.add(num);
            }
        }
        System.out.println("Danh sach sau khi bo trung: " + L1);
        //Cau 3
        int count = 0;
        for (Integer num : L1) {
            if (num < 2) {
                count++;
            }
        }
        System.out.println("So luong so < 2: " + count);
        //Cau 4
        int sum = 0;
        int evenCount = 0;

        for (Integer num : L1) {
            if (num % 2 == 0) {
                sum += num;
                evenCount++;
            }
        }
        if (evenCount > 0) {
            double avg = (double) sum / evenCount;
            System.out.println("Trung binh cong so chan: " + avg);
        }
        else {
            System.out.println("Khong co so chan");
        }
        ArrayList<Integer> chan = new ArrayList<Integer>();
        ArrayList<Integer> le = new ArrayList<Integer>();

        for (Integer num : L1) {
            if (num % 2 == 0) {
                chan.add(num);
            } 
            else {
                le.add(num);
            }
        }

        System.out.println("Danh sach so chan: " + chan);
        System.out.println("Danh sach so le: " + le);
        //Cau 6
        int tmp;
        for(int i = 0; i <= L1.size() / 2; i++)
        {
        	tmp = L1.get(i);
        	L1.set(i,  L1.get(n - i - 1));
        	L1.set(n - i - 1, tmp);
        }
        System.out.println("Danh sach dao nguoc: " + L1);
        sc.close();
    }
}
