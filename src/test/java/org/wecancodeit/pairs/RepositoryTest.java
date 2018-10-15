package org.wecancodeit.pairs;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class RepositoryTest {

	private Repository repo = new Repository();
	
	@Test
	public void shouldAddStudent() {
		Student testStudent = new Student("Jimothy");
		int before = repo.size();
		repo.add(testStudent);
		int after = repo.size();
		assertThat(after, is(equalTo(before + 1)));
	}
	
	@Test
	public void shouldMakePairs() {
		repo.makePairs();
		ArrayList<String> result = repo.getPairs();
		assertThat(result.size(), is(repo.size()/2));
	}
}
