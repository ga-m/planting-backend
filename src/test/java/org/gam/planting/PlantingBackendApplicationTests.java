package org.gam.planting;

import java.util.List;

import org.gam.planting.jpa.entity.Archive;
import org.gam.planting.jpa.entity.Goal;
import org.gam.planting.jpa.entity.Member;
import org.gam.planting.jpa.repository.ArchiveRepository;
import org.gam.planting.jpa.repository.GoalRepository;
import org.gam.planting.jpa.repository.LevelBasicRepository;
import org.gam.planting.jpa.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlantingBackendApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private ArchiveRepository archiveRepository;

	@Autowired
	private GoalRepository goalRepository;

	@Autowired
	private LevelBasicRepository levelBasicRepository;

	@Test
	void createGoalWithArchiveAndLevelBasic() {
		// get Specific Member
		Member member = memberRepository.findById(1L).get();
		System.out.println(member);

		// get Goals of member
		Goal goal = goalRepository.findById(member.getId()).get();
		System.out.println(goal);

		// get Archives of goal
		// List<Archive> archives = archiveRepository.findAll();
		// System.out.println(archives);
	}

}
