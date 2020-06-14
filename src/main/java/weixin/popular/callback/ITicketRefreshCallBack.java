package weixin.popular.callback;

/**
 * @author: hkk
 * @CreateTime: 2020/5/6 下午3:09
 * @Description:
 */
public interface ITicketRefreshCallBack {
    /**
     * token刷新
     * @param appId
     * @param ticket
     */
    public void refreshSuccessCallBack(String appId, String ticket);
}
