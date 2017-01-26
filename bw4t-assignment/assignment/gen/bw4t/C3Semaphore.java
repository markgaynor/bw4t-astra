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


public class C3Semaphore extends ASTRAClass {
	public C3Semaphore() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {19,9,19,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {19,18,58,5},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.C3Semaphore", new int[] {21,8,21,23},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("bw4t")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "sequence"),
						"bw4t.C3Semaphore", new int[] {22,8,58,5}
					),
					new Declaration(
						new Variable(Type.LIST, "sequenceToFind"),
						"bw4t.C3Semaphore", new int[] {23,8,58,5}
					),
					new ModuleCall("ei",
						"bw4t.C3Semaphore", new int[] {24,8,24,24},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("Bot_1")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new When(
						"bw4t.C3Semaphore", new int[] {25,8,58,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L",false)
						}),
						new Block(
							"bw4t.C3Semaphore", new int[] {25,30,28,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.LIST, "sequence"),
									"bw4t.C3Semaphore", new int[] {26,12,28,9},
									new Variable(Type.LIST, "L")
								),
								new Assignment(
									new Variable(Type.LIST, "sequenceToFind"),
									"bw4t.C3Semaphore", new int[] {27,12,28,9},
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
					new Send("bw4t.C3Semaphore", new int[] {31,8,31,48},
						new Performative("inform"),
						Primitive.newPrimitive("main"),
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "sequence")
						})
					),
					new Subgoal(
						"bw4t.C3Semaphore", new int[] {34,8,58,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("RoomC3")
							})
						)
					),
					new ForEach(
						"bw4t.C3Semaphore", new int[] {35,8,58,5},
						new ModuleFormula("ei",
							new Predicate("color", new Term[] {
								new Variable(Type.LONG, "X",false),
								new Variable(Type.STRING, "F",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						),
						new Block(
							"bw4t.C3Semaphore", new int[] {35,44,48,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "i"),
									"bw4t.C3Semaphore", new int[] {36,12,48,9},
									Primitive.newPrimitive(0)
								),
								new Declaration(
									new Variable(Type.INTEGER, "j"),
									"bw4t.C3Semaphore", new int[] {37,12,48,9},
									Primitive.newPrimitive(0)
								),
								new While(
									"bw4t.C3Semaphore", new int[] {38,12,48,9},
									new Comparison("<",
										new Variable(Type.INTEGER, "i"),
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "sequenceToFind")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("bw4t.C3Semaphore","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.C3Semaphore","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										)
									),
									new Block(
										"bw4t.C3Semaphore", new int[] {38,51,47,13},
										new Statement[] {
											new If(
												"bw4t.C3Semaphore", new int[] {40,16,47,13},
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
																		return ((astra.lang.Prelude) intention.getModule("bw4t.C3Semaphore","prelude")).valueAsString(
																			(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.C3Semaphore","prelude")).valueAsString(
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
																return ((astra.lang.Strings) visitor.agent().getModule("bw4t.C3Semaphore","strings")).equal(
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
													"bw4t.C3Semaphore", new int[] {40,84,45,17},
													new Statement[] {
														new Send("bw4t.C3Semaphore", new int[] {42,20,42,54},
															new Performative("inform"),
															Primitive.newPrimitive("main"),
															new Predicate("retrieved", new Term[] {
																new Variable(Type.STRING, "F")
															})
														),
														new Declaration(
															new Variable(Type.BOOLEAN, "x"),
															"bw4t.C3Semaphore", new int[] {43,20,45,17},
															new ModuleTerm("prelude", Type.BOOLEAN,
																new Predicate("remove", new Term[] {
																	new Variable(Type.LIST, "sequenceToFind"),
																	new Variable(Type.INTEGER, "i")
																}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((astra.lang.Prelude) intention.getModule("bw4t.C3Semaphore","prelude")).remove(
																			(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.C3Semaphore","prelude")).remove(
																			(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																			(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																		);
																	}
																}
															)
														),
														new Assignment(
															new Variable(Type.INTEGER, "j"),
															"bw4t.C3Semaphore", new int[] {44,20,45,17},
															Primitive.newPrimitive(1)
														)
													}
												)
											),
											new Assignment(
												new Variable(Type.INTEGER, "i"),
												"bw4t.C3Semaphore", new int[] {46,12,47,13},
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
					new Subgoal(
						"bw4t.C3Semaphore", new int[] {51,8,58,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("FrontRoomC3")
							})
						)
					),
					new When(
						"bw4t.C3Semaphore", new int[] {54,8,58,5},
						new Predicate("initiateAssemble", new Term[] {}),
						new Block(
							"bw4t.C3Semaphore", new int[] {54,32,57,9},
							new Statement[] {
								new ModuleCall("C",
									"bw4t.C3Semaphore", new int[] {55,12,55,41},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Signal received.")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.C3Semaphore","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"bw4t.C3Semaphore", new int[] {56,12,57,9},
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
			"bw4t.C3Semaphore", new int[] {61,9,61,52},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new FormulaVariable(new Variable(Type.FORMULA,"X"))
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {61,51,63,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.C3Semaphore", new int[] {62,8,63,5},
						new Predicate("initiateAssemble", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {66,9,66,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("assemble", new Term[] {
						new Variable(Type.LIST, "L",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {66,28,96,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "sequence"),
						"bw4t.C3Semaphore", new int[] {68,8,96,5},
						new Variable(Type.LIST, "L")
					),
					new Subgoal(
						"bw4t.C3Semaphore", new int[] {71,8,96,5},
						new Goal(
							new Predicate("at", new Term[] {
								Primitive.newPrimitive("RoomC3")
							})
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"bw4t.C3Semaphore", new int[] {72,8,96,5},
						Primitive.newPrimitive(0)
					),
					new ModuleCall("C",
						"bw4t.C3Semaphore", new int[] {74,8,74,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Assembling sequence.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.C3Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"bw4t.C3Semaphore", new int[] {75,8,96,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(6)
						),
						new Block(
							"bw4t.C3Semaphore", new int[] {75,20,95,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "j"),
									"bw4t.C3Semaphore", new int[] {76,8,95,9},
									Primitive.newPrimitive(0)
								),
								new ForEach(
									"bw4t.C3Semaphore", new int[] {78,12,95,9},
									new ModuleFormula("ei",
										new Predicate("color", new Term[] {
											new Variable(Type.LONG, "X",false),
											new Variable(Type.STRING, "F",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									),
									new Block(
										"bw4t.C3Semaphore", new int[] {78,47,94,13},
										new Statement[] {
											new Declaration(
												new Variable(Type.INTEGER, "k"),
												"bw4t.C3Semaphore", new int[] {79,16,94,13},
												Primitive.newPrimitive(0)
											),
											new If(
												"bw4t.C3Semaphore", new int[] {81,16,94,13},
												new Comparison("<",
													new Variable(Type.INTEGER, "i"),
													Primitive.newPrimitive(6)
												),
												new Block(
													"bw4t.C3Semaphore", new int[] {81,24,93,17},
													new Statement[] {
														new If(
															"bw4t.C3Semaphore", new int[] {82,20,93,17},
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
																					return ((astra.lang.Prelude) intention.getModule("bw4t.C3Semaphore","prelude")).valueAsString(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.C3Semaphore","prelude")).valueAsString(
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
																			return ((astra.lang.Strings) visitor.agent().getModule("bw4t.C3Semaphore","strings")).equal(
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
																"bw4t.C3Semaphore", new int[] {82,88,92,21},
																new Statement[] {
																	new Subgoal(
																		"bw4t.C3Semaphore", new int[] {84,24,92,21},
																		new Goal(
																			new Predicate("atBlock", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.C3Semaphore", new int[] {85,24,92,21},
																		new Goal(
																			new Predicate("holding", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.C3Semaphore", new int[] {86,24,92,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("DropZone")
																			})
																		)
																	),
																	new ModuleCall("ei",
																		"bw4t.C3Semaphore", new int[] {87,24,87,36},
																		new Predicate("putDown", new Term[] {}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new Subgoal(
																		"bw4t.C3Semaphore", new int[] {88,24,92,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("RoomC3")
																			})
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "i"),
																		"bw4t.C3Semaphore", new int[] {89,24,92,21},
																		Operator.newOperator('+',
																			new Variable(Type.INTEGER, "i"),
																			Primitive.newPrimitive(1)
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "j"),
																		"bw4t.C3Semaphore", new int[] {90,24,92,21},
																		Primitive.newPrimitive(1)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "k"),
																		"bw4t.C3Semaphore", new int[] {91,24,92,21},
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
			"bw4t.C3Semaphore", new int[] {99,5,99,47},
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
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.C3Semaphore", new int[] {99,46,102,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.C3Semaphore", new int[] {100,4,100,21},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "Location")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.C3Semaphore", new int[] {101,4,102,1},
						new ModuleFormula("ei",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "Location")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {105,5,105,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("atBlock", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {105,27,108,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.C3Semaphore", new int[] {106,4,106,23},
						new Predicate("goToBlock", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.C3Semaphore", new int[] {107,4,108,1},
						new ModuleFormula("ei",
							new Predicate("state", new Term[] {
								Primitive.newPrimitive("arrived")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {111,5,111,50},
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
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.C3Semaphore","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.C3Semaphore", new int[] {111,49,117,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.C3Semaphore", new int[] {112,4,112,20},
						new Predicate("pickUp", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.C3Semaphore","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new ModuleCall("C",
						"bw4t.C3Semaphore", new int[] {113,4,113,23},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("before")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.C3Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"bw4t.C3Semaphore", new int[] {114,4,117,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new BeliefUpdate('-',
						"bw4t.C3Semaphore", new int[] {115,4,117,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new ModuleCall("C",
						"bw4t.C3Semaphore", new int[] {116,4,116,22},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("after")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.C3Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {121,5,121,38},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.C3Semaphore","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {121,37,124,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.C3Semaphore", new int[] {122,4,122,32},
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
								return ((astra.lang.Console) intention.getModule("bw4t.C3Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.C3Semaphore", new int[] {123,4,124,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.C3Semaphore", new int[] {127,5,127,34},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("sequence", new Term[] {
						new Variable(Type.LIST, "L",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.C3Semaphore","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.C3Semaphore", new int[] {127,33,129,1},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.C3Semaphore", new int[] {128,4,129,1},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.C3Semaphore","ei")).sense();
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
			astra.core.Agent agent = new C3Semaphore().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
