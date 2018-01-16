package com.ing.billing.services;	
import java.util.List;

import com.ing.billing.beans.Bill;
import com.ing.billing.beans.Customer;
import com.ing.billing.beans.Plan;
import com.ing.billing.beans.PostpaidAccount;
import com.ing.billing.exceptions.BillDetailsNotFoundException;
import com.ing.billing.exceptions.BillingServicesDownException;
import com.ing.billing.exceptions.CustomerDetailsNotFoundException;
import com.ing.billing.exceptions.InvalidBillMonthException;
import com.ing.billing.exceptions.PlanDetailsNotFoundException;
import com.ing.billing.exceptions.PostpaidAccountNotFoundException;
public class BillingServicesImpl implements BillingServices {

	@Override
	public List<Plan> getPlanAllDetails() throws BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long openPostpaidMobileAccount(int customerID, int planID)
			throws PlanDetailsNotFoundException, CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double generateMonthlyMobileBill(int customerID, long mobileNo, String billMonth, int noOfLocalSMS,
			int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls, int internetDataUsageUnits)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, InvalidBillMonthException,
			BillingServicesDownException, PlanDetailsNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostpaidAccount getPostPaidAccountDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostpaidAccount> getCustomerAllPostpaidAccountsDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill getMobileBillDetails(int customerID, long mobileNo, String billMonth)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, InvalidBillMonthException,
			BillDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> getCustomerPostPaidAccountAllBillDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changePlan(int customerID, long mobileNo, int planID) throws CustomerDetailsNotFoundException,
			PostpaidAccountNotFoundException, PlanDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean closeCustomerPostPaidAccount(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerID)
			throws BillingServicesDownException, CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Plan getCustomerPostPaidAccountPlanDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException,
			PlanDetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer acceptCustomerDetails(Customer customer) throws BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticateCustomer(Customer customer)
			throws CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	}
