package com.dev.service;

import java.util.List;
import com.dev.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}