package com.pranjal.cric.matchdetails;

import java.util.List;

import com.pranjal.cric.enums.BallType;
import com.pranjal.cric.users.Player;

public class Ball {
	private Player balledBy;
	private Player playedBy;
	private BallType type;

	private Wicket wicket;
	private List<Run> runs;
	private Commentary commentary;
}
