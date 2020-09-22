
public class Login {

	public static void main(String[] args) {
		//사용자가 로그인했을때, 1억명 명단중에 있는지, 비밀번호는 맞는지 인증
		
				// Id와 password 명단
				String[][] users = {
					{"egoing", "1111"},
					{"jinhyuck", "2222"},
					{"youbin", "3333"}
				};
				
					// Id와 password 입력
				String inputId = args[0];
				String inputPass = args[1];
				
				
				boolean isLogined = false;					//로그인 상태 false로 초기화
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
