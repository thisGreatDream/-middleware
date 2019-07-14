package job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class GetHottestJob implements Job {

	public void execute(JobExecutionContext jec) throws JobExecutionException {
		System.out.println("根据文章的阅读量和评论量来生成我们的最热文章列表");
	}

}
