
public class Login {

	public static void main(String[] args) {
		//����ڰ� �α���������, 1��� ����߿� �ִ���, ��й�ȣ�� �´��� ����
		
				// Id�� password ���
				String[][] users = {
					{"egoing", "1111"},
					{"jinhyuck", "2222"},
					{"youbin", "3333"}
				};
				
					// Id�� password �Է�
				String inputId = args[0];
				String inputPass = args[1];
				
				
				boolean isLogined = false;					//�α��� ���� false�� �ʱ�ȭ
				for(int i=0; i<users.length; i++) {
					String[] current = users[i];
					if(current[0].equals(inputId) &&
						current[1].equals(inputPass))
					{
						isLogined = true;
						break;
					}
				}
				
				System.out.println("Hi,");
				if(isLogined) {
					System.out.println("Master!");
				} else {
					System.out.println("who are you?");
				}
				
	}

}
