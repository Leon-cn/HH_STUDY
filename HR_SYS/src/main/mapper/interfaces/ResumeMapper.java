package main.mapper.interfaces;

import main.entity.AbstractResume;
import main.utils.Result;

/**
 * @author: hqweay
 * @description: 数据操作方法的定义
 * Created on 7/2/20 12:00 PM
 */
public interface ResumeMapper {
  Result saveResume(AbstractResume resume);

  Result removeResume(AbstractResume resume);

  Result updateResume(AbstractResume oldResume, AbstractResume newResume);

  Result getResume(AbstractResume resume);

  Result listResume();
}
