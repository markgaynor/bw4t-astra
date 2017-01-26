package bw4t;
/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Assembler extends ASTRAClass {
	public Assembler() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.Assembler", new int[] {23,9,23,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {23,18,75,5},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Assembler", new int[] {25,8,25,23},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("bw4t")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "sequence"),
						"bw4t.Assembler", new int[] {26,8,75,5}
					),
					new Declaration(
						new Variable(Type.LIST, "sequenceToFind"),
						"bw4t.Assembler", new int[] {27,8,75,5}
					),
					new ModuleCall("ei",
						"bw4t.Assembler", new int[] {28,8,28,24},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("Bot_1")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new When(
						"bw4t.Assembler", new int[] {29,8,75,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L",false)
						}),
						new Block(
							"bw4t.Assembler", new int[] {29,30,32,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.LIST, "sequence"),
									"bw4t.Assembler", new int[] {30,12,32,9},
									new Variable(Type.LIST, "L")
								),
								new Assignment(
									new Variable(Type.LIST, "sequenceToFind"),
									"bw4t.Assembler", new int[] {31,12,32,9},
									Operator.newOperator('+',
										new Variable(Type.LIST, "L"),
										new ListTerm(new Term[] {
											Primitive.newPrimitive("")
										})
									)
								)
							}
						)
					),
					new Send("bw4t.Assembler", new int[] {35,8,35,48},
						new Performative("inform"),
						Primitive.newPrimitive("main"),
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "sequence")
						})
					),
					new Send("bw4t.Assembler", new int[] {38,8,38,55},
						new Performative("inform"),
						Primitive.newPrimitive("Semaphore"),
						new Predicate("enteringC3", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					),
					new Subgoal(
						"bw4t.Assembler", new int[] {39,8,75,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("RoomC3")
							})
						)
					),
					new ForEach(
						"bw4t.Assembler", new int[] {40,8,75,5},
						new ModuleFormula("ei",
							new Predicate("color", new Term[] {
								new Variable(Type.LONG, "X",false),
								new Variable(Type.STRING, "F",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						),
						new Block(
							"bw4t.Assembler", new int[] {40,44,53,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "i"),
									"bw4t.Assembler", new int[] {41,12,53,9},
									Primitive.newPrimitive(0)
								),
								new Declaration(
									new Variable(Type.INTEGER, "j"),
									"bw4t.Assembler", new int[] {42,12,53,9},
									Primitive.newPrimitive(0)
								),
								new While(
									"bw4t.Assembler", new int[] {43,12,53,9},
									new Comparison("<",
										new Variable(Type.INTEGER, "i"),
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "sequenceToFind")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										)
									),
									new Block(
										"bw4t.Assembler", new int[] {43,51,52,13},
										new Statement[] {
											new If(
												"bw4t.Assembler", new int[] {45,16,52,13},
												new AND(
													new ModuleFormula("strings",
														new Predicate("equal", new Term[] {
															new ModuleTerm("prelude", Type.STRING,
																new Predicate("valueAsString", new Term[] {
																	new Variable(Type.LIST, "sequenceToFind"),
																	new Variable(Type.INTEGER, "i")
																}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).valueAsString(
																			(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).valueAsString(
																			(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																		);
																	}
																}
															),
															new Variable(Type.STRING, "F")
														}),
													new ModuleFormulaAdaptor() {
															public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.Strings) visitor.agent().getModule("bw4t.Assembler","strings")).equal(
																	(java.lang.String) visitor.evaluate(predicate.getTerm(0)),
																	(java.lang.String) visitor.evaluate(predicate.getTerm(1))
																);
														}
													}
														),
													new Comparison("==",
														new Variable(Type.INTEGER, "j"),
														Primitive.newPrimitive(0)
													)
												),
												new Block(
													"bw4t.Assembler", new int[] {45,84,50,17},
													new Statement[] {
														new Send("bw4t.Assembler", new int[] {47,20,47,54},
															new Performative("inform"),
															Primitive.newPrimitive("main"),
															new Predicate("retrieved", new Term[] {
																new Variable(Type.STRING, "F")
															})
														),
														new Declaration(
															new Variable(Type.BOOLEAN, "x"),
															"bw4t.Assembler", new int[] {48,20,50,17},
															new ModuleTerm("prelude", Type.BOOLEAN,
																new Predicate("remove", new Term[] {
																	new Variable(Type.LIST, "sequenceToFind"),
																	new Variable(Type.INTEGER, "i")
																}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).remove(
																			(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).remove(
																			(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																		);
																	}
																}
															)
														),
														new Assignment(
															new Variable(Type.INTEGER, "j"),
															"bw4t.Assembler", new int[] {49,20,50,17},
															Primitive.newPrimitive(1)
														)
													}
												)
											),
											new Assignment(
												new Variable(Type.INTEGER, "i"),
												"bw4t.Assembler", new int[] {51,12,52,13},
												Operator.newOperator('+',
													new Variable(Type.INTEGER, "i"),
													Primitive.newPrimitive(1)
												)
											)
										}
									)
								)
							}
						)
					),
					new Declaration(
						new Variable(Type.LIST, "retrievers"),
						"bw4t.Assembler", new int[] {56,8,75,5},
						new ModuleTerm("system", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("bw4t.Retriever")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("bw4t.Assembler","system")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("bw4t.Assembler","system")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new ForAll(
						"bw4t.Assembler", new int[] {57,8,57,46},
						new Variable(Type.STRING, "agentName",false),
						new Variable(Type.LIST, "retrievers"),
						new Block(
							"bw4t.Assembler", new int[] {57,47,75,5},
							new Statement[] {
								new Send("bw4t.Assembler", new int[] {58,12,58,61},
									new Performative("inform"),
									new Variable(Type.STRING, "agentName"),
									new Predicate("sequence", new Term[] {
										new Variable(Type.LIST, "sequenceToFind")
									})
								)
							}
						)
					),
					new Send("bw4t.Assembler", new int[] {62,8,62,54},
						new Performative("inform"),
						Primitive.newPrimitive("Semaphore"),
						new Predicate("exitingC3", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					),
					new Subgoal(
						"bw4t.Assembler", new int[] {63,8,75,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("FrontRoomC3")
							})
						)
					),
					new If(
						"bw4t.Assembler", new int[] {66,8,75,5},
						new Comparison("==",
							new ModuleTerm("prelude", Type.INTEGER,
								new Predicate("size", new Term[] {
									new ModuleTerm("system", Type.LIST,
										new Predicate("getAgents", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.System) intention.getModule("bw4t.Assembler","system")).getAgents(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.System) visitor.agent().getModule("bw4t.Assembler","system")).getAgents(
												);
											}
										}
									)
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(3)
						),
						new Block(
							"bw4t.Assembler", new int[] {66,48,68,9},
							new Statement[] {
								new Subgoal(
									"bw4t.Assembler", new int[] {67,12,68,9},
									new Goal(
										new Predicate("retrieve", new Term[] {
											new Variable(Type.LIST, "sequenceToFind"),
											new Variable(Type.LIST, "sequence")
										})
									)
								)
							}
						)
					),
					new When(
						"bw4t.Assembler", new int[] {71,8,75,5},
						new Predicate("initiateAssemble", new Term[] {}),
						new Block(
							"bw4t.Assembler", new int[] {71,32,74,9},
							new Statement[] {
								new ModuleCall("C",
									"bw4t.Assembler", new int[] {72,12,72,41},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Signal received.")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"bw4t.Assembler", new int[] {73,12,74,9},
									new Goal(
										new Predicate("assemble", new Term[] {
											new Variable(Type.LIST, "sequence")
										})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {78,9,78,52},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new FormulaVariable(new Variable(Type.FORMULA,"X"))
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {78,51,80,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Assembler", new int[] {79,8,80,5},
						new Predicate("initiateAssemble", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {83,9,83,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("assemble", new Term[] {
						new Variable(Type.LIST, "L",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {83,28,113,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "sequence"),
						"bw4t.Assembler", new int[] {85,8,113,5},
						new Variable(Type.LIST, "L")
					),
					new Subgoal(
						"bw4t.Assembler", new int[] {88,8,113,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("RoomC3")
							})
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"bw4t.Assembler", new int[] {89,8,113,5},
						Primitive.newPrimitive(0)
					),
					new ModuleCall("C",
						"bw4t.Assembler", new int[] {91,8,91,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Assembling sequence.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"bw4t.Assembler", new int[] {92,8,113,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(6)
						),
						new Block(
							"bw4t.Assembler", new int[] {92,20,112,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "j"),
									"bw4t.Assembler", new int[] {93,8,112,9},
									Primitive.newPrimitive(0)
								),
								new ForEach(
									"bw4t.Assembler", new int[] {95,12,112,9},
									new ModuleFormula("ei",
										new Predicate("color", new Term[] {
											new Variable(Type.LONG, "X",false),
											new Variable(Type.STRING, "F",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									),
									new Block(
										"bw4t.Assembler", new int[] {95,47,111,13},
										new Statement[] {
											new Declaration(
												new Variable(Type.INTEGER, "k"),
												"bw4t.Assembler", new int[] {96,16,111,13},
												Primitive.newPrimitive(0)
											),
											new If(
												"bw4t.Assembler", new int[] {98,16,111,13},
												new Comparison("<",
													new Variable(Type.INTEGER, "i"),
													Primitive.newPrimitive(6)
												),
												new Block(
													"bw4t.Assembler", new int[] {98,24,110,17},
													new Statement[] {
														new If(
															"bw4t.Assembler", new int[] {99,20,110,17},
															new AND(
																new ModuleFormula("strings",
																	new Predicate("equal", new Term[] {
																		new ModuleTerm("prelude", Type.STRING,
																			new Predicate("valueAsString", new Term[] {
																				new Variable(Type.LIST, "sequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).valueAsString(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).valueAsString(
																						(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																					);
																				}
																			}
																		),
																		new Variable(Type.STRING, "F")
																	}),
																new ModuleFormulaAdaptor() {
																		public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((astra.lang.Strings) visitor.agent().getModule("bw4t.Assembler","strings")).equal(
																				(java.lang.String) visitor.evaluate(predicate.getTerm(0)),
																				(java.lang.String) visitor.evaluate(predicate.getTerm(1))
																			);
																	}
																}
																	),
																new AND(
																	new Comparison("==",
																		new Variable(Type.INTEGER, "j"),
																		Primitive.newPrimitive(0)
																	),
																	new Comparison("==",
																		new Variable(Type.INTEGER, "k"),
																		Primitive.newPrimitive(0)
																	)
																)
															),
															new Block(
																"bw4t.Assembler", new int[] {99,88,109,21},
																new Statement[] {
																	new Subgoal(
																		"bw4t.Assembler", new int[] {101,24,109,21},
																		new Goal(
																			new Predicate("atBlock", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {102,24,109,21},
																		new Goal(
																			new Predicate("holding", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {103,24,109,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("DropZone")
																			})
																		)
																	),
																	new ModuleCall("ei",
																		"bw4t.Assembler", new int[] {104,24,104,36},
																		new Predicate("putDown", new Term[] {}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {105,24,109,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("RoomC3")
																			})
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "i"),
																		"bw4t.Assembler", new int[] {106,24,109,21},
																		Operator.newOperator('+',
																			new Variable(Type.INTEGER, "i"),
																			Primitive.newPrimitive(1)
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "j"),
																		"bw4t.Assembler", new int[] {107,24,109,21},
																		Primitive.newPrimitive(1)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "k"),
																		"bw4t.Assembler", new int[] {108,24,109,21},
																		Primitive.newPrimitive(1)
																	)
																}
															)
														)
													}
												)
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {116,5,116,47},
			new GoalEvent('+',
				new Goal(
					new Predicate("at", new Term[] {
						new Variable(Type.STRING, "Location",false)
					})
				)
			),
			new NOT(
				new ModuleFormula("ei",
					new Predicate("at", new Term[] {
						new Variable(Type.STRING, "Location")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.Assembler", new int[] {116,46,119,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Assembler", new int[] {117,4,117,21},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "Location")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.Assembler", new int[] {118,4,119,1},
						new ModuleFormula("ei",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "Location")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {122,5,122,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("atBlock", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {122,27,125,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Assembler", new int[] {123,4,123,23},
						new Predicate("goToBlock", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.Assembler", new int[] {124,4,125,1},
						new ModuleFormula("ei",
							new Predicate("state", new Term[] {
								Primitive.newPrimitive("arrived")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {128,5,128,50},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				)
			),
			new NOT(
				new ModuleFormula("ei",
					new Predicate("holding", new Term[] {
						new Variable(Type.LONG, "X",false)
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.Assembler", new int[] {128,49,134,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Assembler", new int[] {129,4,129,20},
						new Predicate("pickUp", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new ModuleCall("C",
						"bw4t.Assembler", new int[] {130,4,130,23},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("before")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"bw4t.Assembler", new int[] {131,4,134,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new BeliefUpdate('-',
						"bw4t.Assembler", new int[] {132,4,134,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new ModuleCall("C",
						"bw4t.Assembler", new int[] {133,4,133,22},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("after")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {138,5,138,38},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.Assembler","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {138,37,141,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.Assembler", new int[] {139,4,139,32},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("holding:"),
								new Variable(Type.LONG, "Block")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.Assembler", new int[] {140,4,141,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {144,5,144,34},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("sequence", new Term[] {
						new Variable(Type.LIST, "L",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.Assembler","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {144,33,146,1},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Assembler", new int[] {145,4,146,1},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Assembler", new int[] {149,5,149,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("retrieve", new Term[] {
						new Variable(Type.LIST, "sequence",false),
						new Variable(Type.LIST, "assembleOrder",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Assembler", new int[] {149,50,198,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.Assembler", new int[] {150,4,150,64},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("No Retriever agents found. Retrieving blocks...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Assembler","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "roomList"),
						"bw4t.Assembler", new int[] {153,4,198,1},
						new ListTerm(new Term[] {
							Primitive.newPrimitive("RoomC2"),
							Primitive.newPrimitive("RoomC1"),
							Primitive.newPrimitive("RoomB3"),
							Primitive.newPrimitive("RoomB2"),
							Primitive.newPrimitive("RoomB1"),
							Primitive.newPrimitive("RoomA3"),
							Primitive.newPrimitive("RoomA2"),
							Primitive.newPrimitive("RoomA1")
						})
					),
					new Declaration(
						new Variable(Type.STRING, "myRoom"),
						"bw4t.Assembler", new int[] {154,4,198,1},
						Primitive.newPrimitive("RoomC2")
					),
					new Declaration(
						new Variable(Type.INTEGER, "myRoomIndex"),
						"bw4t.Assembler", new int[] {155,4,198,1},
						Primitive.newPrimitive(0)
					),
					new While(
						"bw4t.Assembler", new int[] {158,4,198,1},
						new Comparison("<",
							new Variable(Type.INTEGER, "myRoomIndex"),
							new ModuleTerm("prelude", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "roomList")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							)
						),
						new Block(
							"bw4t.Assembler", new int[] {158,49,197,5},
							new Statement[] {
								new Subgoal(
									"bw4t.Assembler", new int[] {160,8,197,5},
									new Goal(
										new Predicate("at", new Term[] {
											new Variable(Type.STRING, "myRoom")
										})
									)
								),
								new ForEach(
									"bw4t.Assembler", new int[] {163,8,197,5},
									new ModuleFormula("ei",
										new Predicate("color", new Term[] {
											new Variable(Type.LONG, "X",false),
											new Variable(Type.STRING, "F",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Assembler","ei")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									),
									new Block(
										"bw4t.Assembler", new int[] {163,44,182,9},
										new Statement[] {
											new Declaration(
												new Variable(Type.INTEGER, "i"),
												"bw4t.Assembler", new int[] {164,12,182,9},
												Primitive.newPrimitive(0)
											),
											new Declaration(
												new Variable(Type.INTEGER, "j"),
												"bw4t.Assembler", new int[] {165,12,182,9},
												Primitive.newPrimitive(0)
											),
											new While(
												"bw4t.Assembler", new int[] {166,12,182,9},
												new Comparison("<",
													new Variable(Type.INTEGER, "i"),
													new ModuleTerm("prelude", Type.INTEGER,
														new Predicate("size", new Term[] {
															new Variable(Type.LIST, "sequence")
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).size(
																	(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).size(
																	(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
																);
															}
														}
													)
												),
												new Block(
													"bw4t.Assembler", new int[] {166,45,181,13},
													new Statement[] {
														new If(
															"bw4t.Assembler", new int[] {168,16,181,13},
															new AND(
																new ModuleFormula("strings",
																	new Predicate("equal", new Term[] {
																		new ModuleTerm("prelude", Type.STRING,
																			new Predicate("valueAsString", new Term[] {
																				new Variable(Type.LIST, "sequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).valueAsString(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).valueAsString(
																						(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																					);
																				}
																			}
																		),
																		new Variable(Type.STRING, "F")
																	}),
																new ModuleFormulaAdaptor() {
																		public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((astra.lang.Strings) visitor.agent().getModule("bw4t.Assembler","strings")).equal(
																				(java.lang.String) visitor.evaluate(predicate.getTerm(0)),
																				(java.lang.String) visitor.evaluate(predicate.getTerm(1))
																			);
																	}
																}
																	),
																new Comparison("==",
																	new Variable(Type.INTEGER, "j"),
																	Primitive.newPrimitive(0)
																)
															),
															new Block(
																"bw4t.Assembler", new int[] {168,78,179,17},
																new Statement[] {
																	new Subgoal(
																		"bw4t.Assembler", new int[] {170,20,179,17},
																		new Goal(
																			new Predicate("atBlock", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {171,20,179,17},
																		new Goal(
																			new Predicate("holding", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {172,20,179,17},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("RoomC3")
																			})
																		)
																	),
																	new Send("bw4t.Assembler", new int[] {174,20,174,54},
																		new Performative("inform"),
																		Primitive.newPrimitive("main"),
																		new Predicate("retrieved", new Term[] {
																			new Variable(Type.STRING, "F")
																		})
																	),
																	new ModuleCall("ei",
																		"bw4t.Assembler", new int[] {175,20,175,32},
																		new Predicate("putDown", new Term[] {}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.Assembler","ei")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new Subgoal(
																		"bw4t.Assembler", new int[] {176,20,179,17},
																		new Goal(
																			new Predicate("at", new Term[] {
																				new Variable(Type.STRING, "myRoom")
																			})
																		)
																	),
																	new Declaration(
																		new Variable(Type.BOOLEAN, "x"),
																		"bw4t.Assembler", new int[] {177,20,179,17},
																		new ModuleTerm("prelude", Type.BOOLEAN,
																			new Predicate("remove", new Term[] {
																				new Variable(Type.LIST, "sequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).remove(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).remove(
																						(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																					);
																				}
																			}
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "j"),
																		"bw4t.Assembler", new int[] {178,20,179,17},
																		Primitive.newPrimitive(1)
																	)
																}
															)
														),
														new Assignment(
															new Variable(Type.INTEGER, "i"),
															"bw4t.Assembler", new int[] {180,12,181,13},
															Operator.newOperator('+',
																new Variable(Type.INTEGER, "i"),
																Primitive.newPrimitive(1)
															)
														)
													}
												)
											)
										}
									)
								),
								new If(
									"bw4t.Assembler", new int[] {184,8,197,5},
									new Comparison("==",
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "sequence")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(1)
									),
									new Block(
										"bw4t.Assembler", new int[] {184,38,187,9},
										new Statement[] {
											new Subgoal(
												"bw4t.Assembler", new int[] {185,12,187,9},
												new Goal(
													new Predicate("assemble", new Term[] {
														new Variable(Type.LIST, "assembleOrder")
													})
												)
											),
											new ModuleCall("system",
												"bw4t.Assembler", new int[] {186,12,186,30},
												new Predicate("terminate", new Term[] {}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.System) intention.getModule("bw4t.Assembler","system")).terminate(
														);
													}
												}
											)
										}
									)
								),
								new If(
									"bw4t.Assembler", new int[] {190,8,197,5},
									new Comparison("==",
										new Variable(Type.INTEGER, "myRoomIndex"),
										Primitive.newPrimitive(7)
									),
									new Block(
										"bw4t.Assembler", new int[] {190,27,192,9},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "myRoomIndex"),
												"bw4t.Assembler", new int[] {191,12,192,9},
												Primitive.newPrimitive(1)
											)
										}
									),
									new Block(
										"bw4t.Assembler", new int[] {193,12,197,5},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "myRoomIndex"),
												"bw4t.Assembler", new int[] {194,12,195,9},
												Operator.newOperator('+',
													new Variable(Type.INTEGER, "myRoomIndex"),
													Primitive.newPrimitive(1)
												)
											)
										}
									)
								),
								new Assignment(
									new Variable(Type.STRING, "myRoom"),
									"bw4t.Assembler", new int[] {196,8,197,5},
									new ModuleTerm("prelude", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "roomList"),
											new Variable(Type.INTEGER, "myRoomIndex")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("bw4t.Assembler","prelude")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Assembler","prelude")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.Assembler","ei")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		fragment.addModule("prelude",astra.lang.Prelude.class,agent);
		fragment.addModule("strings",astra.lang.Strings.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new BasicSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Assembler().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
