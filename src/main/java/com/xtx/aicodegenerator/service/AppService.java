package com.xtx.aicodegenerator.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xtx.aicodegenerator.model.dto.app.AppAddRequest;
import com.xtx.aicodegenerator.model.dto.app.AppQueryRequest;
import com.xtx.aicodegenerator.model.entity.App;
import com.xtx.aicodegenerator.model.entity.User;
import com.xtx.aicodegenerator.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a>xtx</a>
 */
public interface AppService extends IService<App> {

    String deployApp (Long appId, User loginUser);

    /**
     * 异步生成应用截图并更新封面
     *
     * @param appId  应用ID
     * @param appUrl 应用访问URL
     */
    void generateAppScreenshotAsync(Long appId, String appUrl);

    public AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Long createApp(AppAddRequest appAddRequest, User loginUser);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
