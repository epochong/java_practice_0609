/**
 * @author wangchong
 * @date 2019/6/9 20:22
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
class NoThisSongException extends Exception {
    public NoThisSongException() {
        super();
    }

    public NoThisSongException(String message) {
        super(message);
    }
}