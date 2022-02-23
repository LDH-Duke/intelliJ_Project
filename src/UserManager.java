public class UserManager {
    int MAX_SIZE=100;
    User[] users = new User[MAX_SIZE];
    int size=0;

    void AddUser(String name, String birthday){
        User user = new User();
        user.setName(name);
        user.setBirthday(birthday);

        users[size++]=user;
    }

    void RemoveUser(String name){
        System.out.println("-----삭제되었습니다.-----");
        for(int i=0; i<size; i++){
            if(users[i].getName().equals(name)){
                for(;i<size;i++){
                    users[i]=users[i+1];
                }
                size--;
            }
        }
    }
}
