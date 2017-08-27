/*
 * Copyright 2017-2068 lipw
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nirvana.mail.service.impl;

import com.nirvana.mail.service.SendMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 发送邮件服务实现类.
 *
 * @author lipw
 * @version 1.0
 * @date 2017/8/26 16:00
 */
@Service("sendMailService")
public class SendMailServiceImpl implements SendMailService {

    private static final Logger LOG = LoggerFactory.getLogger(SendMailServiceImpl.class);

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail() {

    }
}
