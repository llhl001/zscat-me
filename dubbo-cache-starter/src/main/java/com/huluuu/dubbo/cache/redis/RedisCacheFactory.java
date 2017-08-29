package com.huluuu.dubbo.cache.redis;

import com.alibaba.dubbo.cache.Cache;
import com.alibaba.dubbo.common.URL;
import com.huluuu.dubbo.cache.AbstractCacheFactory;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created on  : 2017/07/22  下午3:19
 */
public class RedisCacheFactory extends AbstractCacheFactory {

    @Override
    protected Cache generateNewCache(String cacheName, URL url) {
        return new RedisCache(cacheName,url);
    }
}
