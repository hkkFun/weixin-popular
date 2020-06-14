package weixin.popular.callback;

/**
 * @author: hkk
 * @CreateTime: 2020/5/6 下午3:09
 * @Description:
 */
public interface ITokenRefreshCallBack {
    /**
     * token刷新
     * @param appId
     * @param token
     */
    public void refreshSuccessCallBack(String appId, String token);
}
