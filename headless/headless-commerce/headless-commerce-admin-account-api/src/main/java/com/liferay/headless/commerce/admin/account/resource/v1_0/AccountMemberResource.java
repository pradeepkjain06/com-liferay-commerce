/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.commerce.admin.account.resource.v1_0;

import com.liferay.headless.commerce.admin.account.dto.v1_0.AccountMember;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import javax.annotation.Generated;

import javax.ws.rs.core.Response;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-commerce-admin-account/v1.0
 *
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
public interface AccountMemberResource {

	public Page<AccountMember>
			getAccountByExternalReferenceCodeAccountMembersPage(
				String externalReferenceCode, Pagination pagination)
		throws Exception;

	public AccountMember postAccountByExternalReferenceCodeAccountMember(
			String externalReferenceCode, AccountMember accountMember)
		throws Exception;

	public Response deleteAccountByExternalReferenceCodeAccountMember(
			String externalReferenceCode, Long userId)
		throws Exception;

	public AccountMember getAccountByExternalReferenceCodeAccountMember(
			String externalReferenceCode, Long userId)
		throws Exception;

	public Response patchAccountByExternalReferenceCodeAccountMember(
			String externalReferenceCode, Long userId,
			AccountMember accountMember)
		throws Exception;

	public Page<AccountMember> getAccountIdAccountMembersPage(
			Long id, Pagination pagination)
		throws Exception;

	public AccountMember postAccountIdAccountMember(
			Long id, AccountMember accountMember)
		throws Exception;

	public Response deleteAccountIdAccountMember(Long id, Long userId)
		throws Exception;

	public AccountMember getAccountIdAccountMember(Long id, Long userId)
		throws Exception;

	public Response patchAccountIdAccountMember(
			Long id, Long userId, AccountMember accountMember)
		throws Exception;

	public void setContextCompany(Company contextCompany);

}