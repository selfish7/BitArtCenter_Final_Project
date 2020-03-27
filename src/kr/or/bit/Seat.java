package kr.or.bit;
import java.util.Scanner;
public class Seat {
    private Scanner scanner = new Scanner(System.in);
    int row, col;
    private String[][] seatballet1 ; //좌석정보
    //private String[][] seat2 ;
    //private String[][] seat3 ;
    //private String[][] seat4 ;
    public void ballet1seat() {
        int row, col;
        
        do {
            try {
                System.out.print("예매할 좌석 위치를 입력하세요(ex:2,1): ");
                String inputSeat = scanner.nextLine();
                String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
                
                row = Integer.parseInt(seatArr[0])-1;
                col = Integer.parseInt(seatArr[1])-1;
                if(row > 4 || col > 5) {
                    throw new Exception("좌석을 잘못 입력하셨습니다.");
                } else {
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("(0,0)부터 (2,4)번의 자리까지만 존재합니다.");
            }
        } while(true);
        
        if (seatballet1[row][col].equals("___")) {
            //받은 위치로 예매
            System.out.println("예매가 완료되었습니다.");
        } else {
            System.out.println("이미 예약된 자리입니다");
        }
        
    }//ballet1seat() End
}//Seat End



