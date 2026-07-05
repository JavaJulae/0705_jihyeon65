class BoardPost{
    String title;
    String content;
    private int viewCount;

    BoardPost(String title, String content){
        this.title = title;
        this.content = content;
        this.viewCount = 0;
    }

    void read() {
        this.viewCount++;

        if(this.viewCount >= 10) {
            System.out.println("[인기] " + title);
        } else {
            System.out.println(this.title);
        }
    }
}

public class Main {
    public static void main(String[] args){
        BoardPost post = new BoardPost("안녕하세요", "한남대학교");
        System.out.println("시작 !!");

        for (int i = 0; i < 12; i++){
            System.out.printf("%d번째 조회 결과: ", i);
            post.read();
        }
    }
}