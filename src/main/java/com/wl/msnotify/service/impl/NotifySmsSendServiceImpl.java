package com.wl.msnotify.service.impl;

import com.wl.msnotify.entity.NotifyConfig;
import com.wl.msnotify.service.NotifySendService;
import com.wl.msnotify.util.BaseException;
import org.springframework.stereotype.Service;

/**
 * @desc 短信功能
 **/
@Service("sms")
public class NotifySmsSendServiceImpl implements NotifySendService {

    @Override
    public void send(NotifyConfig notifyConfig) {
        throw new BaseException("未提供短信功能");
    }
}
