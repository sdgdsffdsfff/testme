/**
 * Project: com.alibaba.testme.core
 * 
 * File Created at 2013-5-24
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.testme.core.testunitflow.impl;

import com.alibaba.testme.client.testunit.dto.TestunitResult;
import com.alibaba.testme.core.testunitflow.ITestunitFlowAfterProcessor;
import com.alibaba.testme.core.testunitflow.context.TestunitFlowContext;

/**
 * 生成后续测试单元实例节点信息
 * 
 * @author chongan.wangca
 */
public class TestunitFlowAfterProcessor implements ITestunitFlowAfterProcessor {

    /*
     * (non-Javadoc)
     * @see
     * com.alibaba.testme.core.testunitflow.ITestunitFlowRouter#doRoute(com.
     * alibaba.testme.core.testunitflow.context.TestunitFlowContext,
     * com.alibaba.testme.client.testunit.dto.TestunitResult)
     */
    @Override
    public void doProcess(TestunitFlowContext testunitFlowContext, TestunitResult testunitResult) {
        // TODO Auto-generated method stub
    }

}
