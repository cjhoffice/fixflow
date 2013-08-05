/**
 * Copyright 1996-2013 Founder International Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author kenshin
 */
package com.founder.fix.fixflow.core.task;

import java.util.Date;
import java.util.List;

import com.founder.fix.fixflow.core.impl.identity.GroupTo;
import com.founder.fix.fixflow.core.query.Query;



/**
 * 任务查询器
 * 
 * @author kenshin
 */
public interface TaskQuery extends Query<TaskQuery, TaskInstance> {

	TaskQuery taskIsEnd();
	
	TaskQuery category(String category);
	
	TaskQuery isAgent(boolean isAgent);
	
	TaskQuery agentId(String agentId);

	TaskQuery taskNotEnd();
	
	
	TaskQuery isSuspended(boolean isSuspended);
	
	TaskQuery tokenId(String tokenId);
	
	TaskQuery callActivityInstanceId(String callActivityInstanceId);
	
	
	/**
	 * 提交人
	 * @return
	 */
	TaskQuery initiator(String initiator);
	
	TaskQuery initiatorLike(String initiator);

	TaskQuery taskId(String taskId);

	TaskQuery taskName(String name);
	
	TaskQuery businessKey(String businessKey);
	
	TaskQuery addTaskType(TaskInstanceType taskInstanceType);

	TaskQuery taskNameLike(String nameLike);

	TaskQuery taskDescription(String description);

	TaskQuery taskDescriptionLike(String descriptionLike);

	TaskQuery taskPriority(Integer priority);

	TaskQuery taskMinPriority(Integer minPriority);

	TaskQuery taskMaxPriority(Integer maxPriority);

	TaskQuery taskAssignee(String assignee);

	TaskQuery taskOwner(String owner);

	TaskQuery taskUnnassigned();

	TaskQuery taskCandidateUser(String candidateUser);

	TaskQuery taskInvolvedUser(String involvedUser);

	TaskQuery taskCandidateGroup(GroupTo candidateGroup);

	TaskQuery processInstanceId(String processInstanceId);
	
	TaskQuery containsSubProcess();

	TaskQuery executionId(String executionId);

	TaskQuery taskCreatedOn(Date createTime);

	TaskQuery taskCreatedBefore(Date before);

	TaskQuery taskCreatedAfter(Date after);

	TaskQuery taskDefinitionKey(String key);

	TaskQuery taskDefinitionKeyLike(String keyLike);

	TaskQuery processDefinitionKey(String processDefinitionKey);
	
	
	TaskQuery processDefinitionKey(List<String> processDefinitionKeyList);
	

	TaskQuery processDefinitionId(String processDefinitionId);

	TaskQuery processDefinitionName(String processDefinitionName);

	TaskQuery dueDate(Date dueDate);

	TaskQuery dueBefore(Date dueDate);

	TaskQuery dueAfter(Date dueDate);
	
	TaskQuery assigneeNotNull();
	
	TaskQuery candidateNotNull();
	
	
	TaskQuery nodeId(String nodeId);
	// ordering ////////////////////////////////////////////////////////////

	TaskQuery orderByTaskId();

	TaskQuery orderByTaskName();

	TaskQuery orderByTaskDescription();

	TaskQuery orderByTaskPriority();

	TaskQuery orderByTaskAssignee();

	TaskQuery orderByTaskCreateTime();

	TaskQuery orderByProcessInstanceId();

	TaskQuery orderByExecutionId();

	TaskQuery orderByDueDate();

	TaskQuery orderByEndTime();

}
