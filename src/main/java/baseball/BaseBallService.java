package baseball;

import camp.nextstep.edu.missionutils.Console;

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
    private final Player player;
    private Computer computer;

    public BaseBallService() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public void Play(){
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (true){
            System.out.print("숫자를 입력해주세요 : ");
            List<Integer> playerNumbers = player.readNumberList(Console.readLine());
            boolean flag = computer.endChecking(playerNumbers);
            if(flag){
                boolean restart = restart();
                if(restart){
                    computer = new Computer();
                }
                if(!restart){
                    break;
                }
            }
        }
    }

    private boolean restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String restartStr = Console.readLine();
        if(restartStr.length() != 1){
            throw new IllegalArgumentException("1과 2를 입력하세요");
        }
        if(!(restartStr.equals("1")||restartStr.equals("2"))){
            throw new IllegalArgumentException("1과 2를 입력하세요");
        }
        return restartStr.equals("1");
    }
}
