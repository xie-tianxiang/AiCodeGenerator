package com.xtx.aicodegenerator.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
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

    public AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
