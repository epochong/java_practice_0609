/**
 * @author wangchong
 * @date 2019/6/9 20:23
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test {
    public static void main(String[] args) {
        Player player = new Player();

        try {
            player.play(12);
        } catch (NoThisSongException e) {
            System.out.println("异常信息为： " + e.getMessage());
        }
    }
}