package com.qingtian.service;


import com.qingtian.domain.Video;

import java.util.List;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/08/19
 * @description 视频业务类接口
 */
public interface VideoService {

    List<Video> findAll();

    Video findById(int id);

    int update(Video Video);

    int delete(int id);

    int save(Video video);

}
