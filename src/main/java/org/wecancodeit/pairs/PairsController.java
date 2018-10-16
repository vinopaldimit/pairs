package org.wecancodeit.pairs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PairsController {

	private Repository repo = new Repository();

	@GetMapping("/pairs")
	public String getPairs(Model model) {
		repo.makePairs();
		model.addAttribute("pairs", repo.getPairs());
		return "pairs";
	}

}
