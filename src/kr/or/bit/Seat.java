package kr.or.bit;
import java.util.Scanner;
public class Seat {
    private Scanner scanner = new Scanner(System.in);
    int row, col;
    private String[][] seatballet1 ; //�¼�����
    //private String[][] seat2 ;
    //private String[][] seat3 ;
    //private String[][] seat4 ;
    public void ballet1seat() {
        int row, col;
        
        do {
            try {
                System.out.print("������ �¼� ��ġ�� �Է��ϼ���(ex:2,1): ");
                String inputSeat = scanner.nextLine();
                String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
                
                row = Integer.parseInt(seatArr[0])-1;
                col = Integer.parseInt(seatArr[1])-1;
                if(row > 4 || col > 5) {
                    throw new Exception("�¼��� �߸� �Է��ϼ̽��ϴ�.");
                } else {
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("(0,0)���� (2,4)���� �ڸ������� �����մϴ�.");
            }
        } while(true);
        
        if (seatballet1[row][col].equals("___")) {
            //���� ��ġ�� ����
            System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
        } else {
            System.out.println("�̹� ����� �ڸ��Դϴ�");
        }
        
    }//ballet1seat() End
}//Seat End



