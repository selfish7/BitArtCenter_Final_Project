package kr.or.bit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private String adminId;
    private int adminPwd;
    private int totalBalance;
    Scanner scanner = new Scanner(System.in);
    public List<ShowSelection> addShow = new ArrayList<ShowSelection>(); // ���� ���� - �ȵǸ� �Լ���.... public
                                                                         // List<ShowSelection> addShow(){return null};
    ShowSelection showselection = new ShowSelection();
    ShowInfo showinfo = new ShowInfo();

    // ***********����*****************
    // �ѹ� ������ ������ ���̻� �����Ҽ� ���� �ؾߵȴ�....... + 2�� �ޱ�,,,, �������� + ��¥
    public void addConcert() { // ��������(private �ع����� ������������� �����ڷα��� �޴����� �Ⱥ���)
        File file = new File("show.txt");
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;

        Loop: while (true) {
            System.out.println("� ������ �����Ͻðڽ��ϱ�??");
            System.out.println("1.�߷�");
            System.out.println("2.����ȸ");
            System.out.println("3.�����");
            System.out.println("4.adminLogin �޴��� ���ư���");
            System.out.print("1~4���ϳ��� �Է��ϼ���:");
            int selection = Integer.parseInt(scanner.nextLine());

            switch (selection) {
            case 1: // �߷� ������ ����
                System.out.println("������ ���� ��¥�� �Է��ϼ���(4.1)(4.4)");
                String showDate = scanner.nextLine();
                if (showDate.equals("4.1")) {
                    showselection.Ballet1();
                    System.out.println("4.1������ �����Ǿ����ϴ�");
                } else if (showDate.equals("4.4")) {
                    showselection.Ballet2();
                    System.out.println("4.4������ �����Ǿ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���");

                }
                break;

            case 2: // ����ȸ ����
                System.out.println("������ ���� ��¥�� �Է��ϼ���(4.2)(4.6)");
                String showDate2 = scanner.nextLine();
                if (showDate2.equals("4.2")) {
                    showselection.Concert1();
                    System.out.println("4.2������ �����Ǿ����ϴ�");
                } else if (showDate2.equals("4.6")) {
                    showselection.Concert2();
                    System.out.println("4.6������ �����Ǿ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

                }
                break;

            case 3: // ����� ���� ����
                System.out.println("������ ���� ��¥�� �Է��ϼ���(4.3)(4.5)(4.7)");
                String showDate3 = scanner.nextLine();
                if (showDate3.equals("4.3")) {
                    showselection.Opera1();
                    System.out.println("4.3������ �����Ǿ����ϴ�");
                } else if (showDate3.equals("4.5")) {
                    showselection.Opera2();
                    System.out.println("4.5������ �����Ǿ����ϴ�");
                } else if (showDate3.equals("4.7")) {
                    showselection.Opera3();
                    System.out.println("4.7������ �����Ǿ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

                }
                break;
            case 4:// adminLogin �޴��� ���ư���
                break Loop; // while���� Ż����
            default:
                break;

            }// switch End

        } // Loop:while End
    }// addConcert() End

    public void reviseShow() { // ���� ����
        Loop1: while (true) {
            System.out.println("� ������ �����Ͻðڽ��ϱ�??");
            System.out.println("1.�߷�");
            System.out.println("2.����ȸ");
            System.out.println("3.�����");
            System.out.println("4.adminLogin �޴��� ���ư���");
            System.out.print("1~4���ϳ��� �Է��ϼ���:");
            int selection = Integer.parseInt(scanner.nextLine());
            Loop2: switch (selection) {
            case 1:
                System.out.println("������ �߷����� ��¥�� �Է��ϼ���(4.1)(4.4)");
                String showDate = scanner.nextLine(); // showData �� �߷�ȸ���� ����

                if (showDate.equals("4.1")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.1")) {
                            // showselection.showList.get(i).getShowType().equals("Ballet1")
                            System.out.println("���� �ð�:19:00" + " " + "����ð�:22:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                } else if (showDate.equals("4.4")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.4")) {
                            System.out.println("���� �ð�:19:00" + " " + "����ð�:22:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }
                    }
                    break;
                }else{
                    System.out.println("�߸��Է���...�ٽ��Է�");
                    break;
                }
             
            case 2:
                System.out.println("������ ����ȸ���� ��¥�� �Է��ϼ���(4.2)(4.4)");
                String showDate2 = scanner.nextLine(); // showData �� �߷�ȸ���� ����

                if (showDate2.equals("4.2")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.2")) {
                            // showselection.showList.get(i).getShowType().equals("Ballet1")
                            System.out.println("���� �ð�:19:00" + " " + "����ð�:21:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                } else if (showDate2.equals("4.6")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.6")) {
                            System.out.println("���� �ð�:19:00" + " " + "����ð�:21:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                } else {
                    System.out.println("�߸��Է���...�ٽ��Է�");
                    break;
                }
                
            case 3:
                System.out.println("������ ����� ��¥�� �Է��ϼ���(4.3)(4.5)(4.7)");
                String showDate3 = scanner.nextLine(); // showData �� �߷�ȸ���� ����

                if (showDate3.equals("4.3")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.3")) {
                            // showselection.showList.get(i).getShowType().equals("Ballet1")
                            System.out.println("���� �ð�:14:00" + " " + "����ð�:17:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                } else if (showDate3.equals("4.5")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.5")) {
                            System.out.println("���� �ð�:14:00" + " " + "����ð�:17:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                }else if (showDate3.equals("4.7")) {

                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.7")) {
                            System.out.println("���� �ð�:14:00" + " " + "����ð�:17:00");

                            System.out.println("������ ���۽ð��� �Է��ϼ���");
                            String startShow = scanner.nextLine();
                            System.out.println("������ ����ð��� �Է��ϼ���");
                            String EndShow = scanner.nextLine();

                            String start = startShow;
                            String End = EndShow;

                            showselection.showList.get(i).setStartShow(start);
                            showselection.showList.get(i).setEndShow(End);
                            System.out.println("������ ���۽ð�" + showselection.showList.get(i).getStartShow());
                            System.out.println("������ ����ð�" + showselection.showList.get(i).getEndShow());
                            break Loop2;
                        }

                    }
                    break;
                } else {
                    System.out.println("�߸��Է���...�ٽ��Է�");
                    break;
                }    
                
                
            case 4:
                break Loop1;
            default:
                break;
            }
        }
    }// showRevise() End

    public void cancelShow() { // ���� ���
        Loop: while (true) {
            System.out.println("� ������ ����Ͻðڽ��ϱ�??");
            System.out.println("1.�߷�");
            System.out.println("2.����ȸ");
            System.out.println("3.�����");
            System.out.println("4.adminLogin �޴��� ���ư���");
            System.out.print("1~4���ϳ��� �Է��ϼ���:");
            int selection = Integer.parseInt(scanner.nextLine());

            switch (selection) {
            case 1: // �߷� ������ ����
                System.out.println("����� ���� ��¥�� �Է��ϼ���(4.1)(4.4)");
                String showDate = scanner.nextLine();

                if (showDate.equals("4.1")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.1")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.1������ ��ҵǾ����ϴ�");
                } else if (showDate.equals("4.4")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.4")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.4������ ��ҵǾ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���");

                }
                break;

            case 2: // ����ȸ ����
                System.out.println("������ ���� ��¥�� �Է��ϼ���(4.2)(4.6)");
                String showDate2 = scanner.nextLine();
                if (showDate2.equals("4.2")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.2")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.2������ ��ҵǾ����ϴ�");
                } else if (showDate2.equals("4.6")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.6")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.6������ ��ҵǾ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

                }
                break;

            case 3: // ����� ���� ����
                System.out.println("����� ���� ��¥�� �Է��ϼ���(4.3)(4.5)(4.7)");
                String showDate3 = scanner.nextLine();
                if (showDate3.equals("4.3")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.3")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.3������ ��ҵǾ����ϴ�");
                } else if (showDate3.equals("4.5")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.5")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.5������ ��ҵǾ����ϴ�");
                } else if (showDate3.equals("4.7")) {
                    for (int i = 0; i < showselection.showList.size(); i++) {
                        if (showselection.showList.get(i).getShowDate().equals("4.7")) {
                            showselection.showList.remove(i);
                        }
                    }
                    System.out.println("4.7������ ��ҵǾ����ϴ�");
                } else {
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

                }
                break;
            case 4:// adminLogin �޴��� ���ư���
                break Loop; // while���� Ż����
            default:
                break;
            }// switch End
        } // Loop:while End
    }// showCancle() End

    // IO��� Reader
    public void checkList() { //���� ��� Ȯ��(�¼��� ���̺�����) ������� ������� ��ü������ IO(Reader������)
        StringReader input = null;
        String a = showselection.showList.toString();
        try {
            input = new StringReader(a);
            input.read();
        }catch(Exception e) {
        }
        System.out.println(a);
    }//checkList() End

    // ***********��*****************
    public void checkBalance() { // �Ѹ��� Ȯ�� //������ ���� ������.... ����
        System.out.println("�Ѹ���: " + this.totalBalance);
    }// checkBalance() End

//	private void end() {// ����
//	
//	}// end() End

    public String getAdminId() {
        return adminId;
    }

    public int getAdminPwd() {
        return adminPwd;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance += totalBalance;
    }

    
    
}// Admin End
