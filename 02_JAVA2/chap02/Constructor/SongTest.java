package Constructor;

public class SongTest {
    public static void main(String[] args) {
        Song s0 = new Song("띵", "재키와이");
        Song s1 = new Song("Tuesday", "루피");
        Song s2 = new Song("비밀", "박완규");

//      객체 배열 생성
        Song[] songs = {s0, s1, s2};

//      모든 배열 속 객체 출력
        for(int i=0; i<songs.length; i++) {
            System.out.println(songs[i].toStr());
        }
    }
}

class Song {
    String name;
    String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    String toStr() {
        return String.format("Song { name: %s, singer: %s }", name, singer);
    }
}
