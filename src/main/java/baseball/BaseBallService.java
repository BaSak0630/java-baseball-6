package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 이름 BaseBallService
 *
 * 버전 정보 V1
 *
 * 날짜 7월 4일
 *
 * 저작권 주의
 */
public class BaseBallService {
    private Computer computer;
    private Player player;

    public BaseBallService() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public void Play(){
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (true){
            //end check
            System.out.print("숫자를 입력해주세요 : ");
            player.readNumber(Console.readLine());
        }
    }
}
