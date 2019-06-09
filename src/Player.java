/**
 * @author wangchong
 * @date 2019/6/9 20:22
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
class Player {
    public void play(int index) throws NoThisSongException {
        if (index > 10) {
            throw new NoThisSongException("您播放的歌曲不存在");
        }

        System.out.println("正在播放歌曲");
    }
}