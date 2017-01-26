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


public class Retriever extends ASTRAClass {
	public Retriever() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.Retriever", new int[] {26,9,26,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {26,18,106,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "roomList"),
						"bw4t.Retriever", new int[] {28,8,106,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive("RoomA1"),
							Primitive.newPrimitive("RoomA2"),
							Primitive.newPrimitive("RoomA3"),
							Primitive.newPrimitive("RoomB1"),
							Primitive.newPrimitive("RoomB2"),
							Primitive.newPrimitive("RoomB3"),
							Primitive.newPrimitive("RoomC1"),
							Primitive.newPrimitive("RoomC2")
						})
					),
					new BeliefUpdate('+',
						"bw4t.Retriever", new int[] {29,8,106,5},
						new Predicate("available", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					),
					new Declaration(
						new Variable(Type.INTEGER, "myBotIndex"),
						"bw4t.Retriever", new int[] {32,8,106,5},
						Operator.newOperator('-',
							new ModuleTerm("prelude", Type.INTEGER,
								new Predicate("size", new Term[] {
									new ModuleTerm("system", Type.LIST,
										new Predicate("getAgents", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.System) intention.getModule("bw4t.Retriever","system")).getAgents(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.System) visitor.agent().getModule("bw4t.Retriever","system")).getAgents(
												);
											}
										}
									)
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(2)
						)
					),
					new Declaration(
						new Variable(Type.STRING, "myBotName"),
						"bw4t.Retriever", new int[] {33,8,106,5},
						Operator.newOperator('+',
							Primitive.newPrimitive("Bot_"),
							new Variable(Type.INTEGER, "myBotIndex")
						)
					),
					new ModuleCall("C",
						"bw4t.Retriever", new int[] {34,8,34,28},
						new Predicate("println", new Term[] {
							new Variable(Type.STRING, "myBotName")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Retriever","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.INTEGER, "myRoomIndex"),
						"bw4t.Retriever", new int[] {37,8,106,5}
					),
					new If(
						"bw4t.Retriever", new int[] {38,8,106,5},
						new Comparison("==",
							Operator.newOperator('%',
								new Variable(Type.INTEGER, "myBotIndex"),
								Primitive.newPrimitive(2)
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"bw4t.Retriever", new int[] {38,30,42,9},
							new Statement[] {
								new ModuleCall("prelude",
									"bw4t.Retriever", new int[] {40,12,40,37},
									new Predicate("reverse", new Term[] {
										new Variable(Type.LIST, "roomList")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).reverse(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Assignment(
									new Variable(Type.INTEGER, "myRoomIndex"),
									"bw4t.Retriever", new int[] {41,12,42,9},
									Operator.newOperator('-',
										new Variable(Type.INTEGER, "myBotIndex"),
										Primitive.newPrimitive(2)
									)
								)
							}
						),
						new Block(
							"bw4t.Retriever", new int[] {43,12,106,5},
							new Statement[] {
								new Assignment(
									new Variable(Type.INTEGER, "myRoomIndex"),
									"bw4t.Retriever", new int[] {44,8,45,9},
									Operator.newOperator('-',
										new Variable(Type.INTEGER, "myBotIndex"),
										Primitive.newPrimitive(3)
									)
								)
							}
						)
					),
					new Declaration(
						new Variable(Type.STRING, "myRoom"),
						"bw4t.Retriever", new int[] {46,8,106,5},
						new ModuleTerm("prelude", Type.STRING,
							new Predicate("valueAsString", new Term[] {
								new Variable(Type.LIST, "roomList"),
								new Variable(Type.INTEGER, "myRoomIndex")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).valueAsString(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).valueAsString(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new ModuleCall("ei",
						"bw4t.Retriever", new int[] {49,8,49,23},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("bw4t")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"bw4t.Retriever", new int[] {50,8,50,26},
						new Predicate("link", new Term[] {
							new Variable(Type.STRING, "myBotName")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "retrieveSequence"),
						"bw4t.Retriever", new int[] {53,8,106,5},
						new ListTerm(new Term[] {

						})
					),
					new When(
						"bw4t.Retriever", new int[] {54,8,106,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L",false)
						}),
						new Block(
							"bw4t.Retriever", new int[] {54,30,56,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.LIST, "retrieveSequence"),
									"bw4t.Retriever", new int[] {55,12,56,9},
									new Variable(Type.LIST, "L")
								)
							}
						)
					),
					new If(
						"bw4t.Retriever", new int[] {58,8,106,5},
						new Comparison("==",
							Operator.newOperator('%',
								new Variable(Type.INTEGER, "myBotIndex"),
								Primitive.newPrimitive(2)
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"bw4t.Retriever", new int[] {58,30,61,9},
							new Statement[] {
								new ModuleCall("prelude",
									"bw4t.Retriever", new int[] {60,12,60,45},
									new Predicate("reverse", new Term[] {
										new Variable(Type.LIST, "retrieveSequence")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).reverse(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new ModuleCall("C",
						"bw4t.Retriever", new int[] {63,8,63,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Retrieving blocks.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Retriever","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"bw4t.Retriever", new int[] {66,8,106,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "myRoomIndex"),
							new ModuleTerm("prelude", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "roomList")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							)
						),
						new Block(
							"bw4t.Retriever", new int[] {66,53,105,9},
							new Statement[] {
								new Subgoal(
									"bw4t.Retriever", new int[] {68,12,105,9},
									new Goal(
										new Predicate("at", new Term[] {
											new Variable(Type.STRING, "myRoom")
										})
									)
								),
								new ForEach(
									"bw4t.Retriever", new int[] {71,12,105,9},
									new ModuleFormula("ei",
										new Predicate("color", new Term[] {
											new Variable(Type.LONG, "X",false),
											new Variable(Type.STRING, "F",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Retriever","ei")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									),
									new Block(
										"bw4t.Retriever", new int[] {71,48,95,13},
										new Statement[] {
											new Declaration(
												new Variable(Type.INTEGER, "i"),
												"bw4t.Retriever", new int[] {72,16,95,13},
												Primitive.newPrimitive(0)
											),
											new Declaration(
												new Variable(Type.INTEGER, "j"),
												"bw4t.Retriever", new int[] {73,16,95,13},
												Primitive.newPrimitive(0)
											),
											new While(
												"bw4t.Retriever", new int[] {74,16,95,13},
												new Comparison("<",
													new Variable(Type.INTEGER, "i"),
													new ModuleTerm("prelude", Type.INTEGER,
														new Predicate("size", new Term[] {
															new Variable(Type.LIST, "retrieveSequence")
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).size(
																	(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).size(
																	(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
																);
															}
														}
													)
												),
												new Block(
													"bw4t.Retriever", new int[] {74,57,94,17},
													new Statement[] {
														new If(
															"bw4t.Retriever", new int[] {76,20,94,17},
															new AND(
																new ModuleFormula("strings",
																	new Predicate("equal", new Term[] {
																		new ModuleTerm("prelude", Type.STRING,
																			new Predicate("valueAsString", new Term[] {
																				new Variable(Type.LIST, "retrieveSequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).valueAsString(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).valueAsString(
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
																			return ((astra.lang.Strings) visitor.agent().getModule("bw4t.Retriever","strings")).equal(
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
																"bw4t.Retriever", new int[] {76,90,92,21},
																new Statement[] {
																	new Subgoal(
																		"bw4t.Retriever", new int[] {78,24,92,21},
																		new Goal(
																			new Predicate("atBlock", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Retriever", new int[] {79,24,92,21},
																		new Goal(
																			new Predicate("holding", new Term[] {
																				new Variable(Type.LONG, "X")
																			})
																		)
																	),
																	new Subgoal(
																		"bw4t.Retriever", new int[] {80,24,92,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("FrontRoomC3")
																			})
																		)
																	),
																	new Wait(
																		"bw4t.Retriever", new int[] {81,24,92,21},
																		new Predicate("available", new Term[] {
																			Primitive.newPrimitive("RoomC3")
																		})
																	),
																	new Send("bw4t.Retriever", new int[] {82,24,82,71},
																		new Performative("inform"),
																		Primitive.newPrimitive("Semaphore"),
																		new Predicate("enteringC3", new Term[] {
																			Primitive.newPrimitive("RoomC3")
																		})
																	),
																	new Subgoal(
																		"bw4t.Retriever", new int[] {83,24,92,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("RoomC3")
																			})
																		)
																	),
																	new Send("bw4t.Retriever", new int[] {86,24,86,58},
																		new Performative("inform"),
																		Primitive.newPrimitive("main"),
																		new Predicate("retrieved", new Term[] {
																			new Variable(Type.STRING, "F")
																		})
																	),
																	new ModuleCall("ei",
																		"bw4t.Retriever", new int[] {87,24,87,36},
																		new Predicate("putDown", new Term[] {}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new Send("bw4t.Retriever", new int[] {88,24,88,70},
																		new Performative("inform"),
																		Primitive.newPrimitive("Semaphore"),
																		new Predicate("exitingC3", new Term[] {
																			Primitive.newPrimitive("RoomC3")
																		})
																	),
																	new Subgoal(
																		"bw4t.Retriever", new int[] {89,24,92,21},
																		new Goal(
																			new Predicate("at", new Term[] {
																				new Variable(Type.STRING, "myRoom")
																			})
																		)
																	),
																	new Declaration(
																		new Variable(Type.BOOLEAN, "x"),
																		"bw4t.Retriever", new int[] {90,24,92,21},
																		new ModuleTerm("prelude", Type.BOOLEAN,
																			new Predicate("remove", new Term[] {
																				new Variable(Type.LIST, "retrieveSequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).remove(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).remove(
																						(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																					);
																				}
																			}
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "j"),
																		"bw4t.Retriever", new int[] {91,24,92,21},
																		Primitive.newPrimitive(1)
																	)
																}
															)
														),
														new Assignment(
															new Variable(Type.INTEGER, "i"),
															"bw4t.Retriever", new int[] {93,16,94,17},
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
									"bw4t.Retriever", new int[] {98,12,105,9},
									new Comparison("==",
										new Variable(Type.INTEGER, "myRoomIndex"),
										Primitive.newPrimitive(7)
									),
									new Block(
										"bw4t.Retriever", new int[] {98,31,100,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "myRoomIndex"),
												"bw4t.Retriever", new int[] {99,16,100,13},
												Primitive.newPrimitive(1)
											)
										}
									),
									new Block(
										"bw4t.Retriever", new int[] {101,16,105,9},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "myRoomIndex"),
												"bw4t.Retriever", new int[] {102,16,103,13},
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
									"bw4t.Retriever", new int[] {104,12,105,9},
									new ModuleTerm("prelude", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "roomList"),
											new Variable(Type.INTEGER, "myRoomIndex")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("bw4t.Retriever","prelude")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Retriever","prelude")).valueAsString(
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
		addRule(new Rule(
			"bw4t.Retriever", new int[] {109,5,109,47},
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
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Retriever","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.Retriever", new int[] {109,46,112,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Retriever", new int[] {110,4,110,21},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "Location")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.Retriever", new int[] {111,4,112,1},
						new ModuleFormula("ei",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "Location")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Retriever","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {115,5,115,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("atBlock", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {115,27,118,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Retriever", new int[] {116,4,116,23},
						new Predicate("goToBlock", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.Retriever", new int[] {117,4,118,1},
						new ModuleFormula("ei",
							new Predicate("state", new Term[] {
								Primitive.newPrimitive("arrived")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Retriever","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {121,5,121,50},
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
							return ((astra.lang.EIS) visitor.agent().getModule("bw4t.Retriever","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"bw4t.Retriever", new int[] {121,49,127,1},
				new Statement[] {
					new ModuleCall("ei",
						"bw4t.Retriever", new int[] {122,4,122,20},
						new Predicate("pickUp", new Term[] {
							new Variable(Type.LONG, "Block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Retriever","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new ModuleCall("C",
						"bw4t.Retriever", new int[] {123,4,123,23},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("before")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Retriever","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"bw4t.Retriever", new int[] {124,4,127,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new BeliefUpdate('-',
						"bw4t.Retriever", new int[] {125,4,127,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					),
					new ModuleCall("C",
						"bw4t.Retriever", new int[] {126,4,126,22},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("after")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Retriever","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {131,5,131,38},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						new Variable(Type.LONG, "Block",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.Retriever","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {131,37,134,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.Retriever", new int[] {132,4,132,32},
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
								return ((astra.lang.Console) intention.getModule("bw4t.Retriever","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.Retriever", new int[] {133,4,134,1},
						new Predicate("holding", new Term[] {
							new Variable(Type.LONG, "Block")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {137,5,137,55},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("sequence", new Term[] {
					new Variable(Type.LIST, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {137,54,139,1},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Retriever", new int[] {138,4,139,1},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {142,5,142,60},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("occupied", new Term[] {
					new Variable(Type.STRING, "room",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {142,59,144,1},
				new Statement[] {
					new BeliefUpdate('-',
						"bw4t.Retriever", new int[] {143,4,144,1},
						new Predicate("available", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Retriever", new int[] {145,5,145,58},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("vacant", new Term[] {
					new Variable(Type.STRING, "room",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Retriever", new int[] {145,57,147,1},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Retriever", new int[] {146,4,147,1},
						new Predicate("available", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.Retriever","ei")).sense();
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
			astra.core.Agent agent = new Retriever().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
