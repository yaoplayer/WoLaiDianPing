package com.hmdp.utils;

/**
 * ProjectName: hm-dianping
 * Package: com.hmdp.utils
 * ClassName: ILock
 *
 * @Author 姚昭丞
 * @Create 2025/8/7 14:23
 * @Version 1.0
 * Description:
 */
public interface ILock {

    boolean tryLock(long timeoutSec);

    void unlock();
}
