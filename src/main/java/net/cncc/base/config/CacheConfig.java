package net.sppan.base.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 *  中国人民银行清算总中心(人行清算中心)
 *  待上线域名cncc.cn
 *  http://39.103.137.119/  admin:cncc
 *  liuwangyue@cncc.cn
 *     
 */

@Configuration
//标注启动了缓存
@EnableCaching
public class CacheConfig {

 /**
  * ehcache 主要的管理器
  */
 @Bean
 public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean bean){
     return new EhCacheCacheManager (bean.getObject ());
 }

 /**
  * 据shared与否的设置,Spring分别通过CacheManager.create()或new CacheManager()方式来创建一个ehcache基地.
  */
 @Bean
 public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
     EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean ();
     cacheManagerFactoryBean.setConfigLocation (new ClassPathResource ("ehcache.xml"));
     cacheManagerFactoryBean.setShared (true);
     return cacheManagerFactoryBean;
 }
}
